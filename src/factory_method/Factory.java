package factory_method;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Factory {
	private static final Map<String, Object> objectMap = new HashMap<String, Object>();
	public synchronized static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		String className = null;
		className = c.getName();
		try {
			if (!objectMap.containsKey(className)) {
				Class class1 = Class.forName(className);
				// ����޲ι���
				Constructor constructor = class1.getDeclaredConstructor();
				//�����޲ι����ǿɷ��ʵ�
				constructor.setAccessible(true);
				//����һ��ʵ������
				human = (Human) constructor.newInstance();
				objectMap.put(className, human);

			}
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return (T) objectMap.get(className);

	}
}
