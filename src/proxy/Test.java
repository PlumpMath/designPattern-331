
package proxy;

public class Test {
	public static void main(String[] args) {
		Permission searchPermission = new Permission(Permission.PERMISSION.SEARCH);
        FileTblDao searchDao = new FileTblDaoProxy(searchPermission);
        FileTbl fileTbl = searchDao.getFile("file01");
        //ֻ��Ȩ�޵��û��޸��ļ�
        searchDao.updateFile(fileTbl);
        
        //ȫȨ�޵��û�
        Permission allPermission = new Permission(Permission.PERMISSION.ALL);
        FileTblDao allDao = new FileTblDaoProxy(allPermission);
        //ȫȨ�޵��û��޸��ļ�
        allDao.updateFile(fileTbl);

	}
}
