package commons;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Response implements  Serializable{
    //���������صĸ�����ֵ
    private Map<String, Object> datas;

    //�������
    private String errorCode;

    //�ͻ��˴�����, ��ֵ������Request�����������Map��
    private String actionClass;


    public  Response(String actionClass) {
        this.datas = new HashMap<String, Object>();
        this.actionClass = actionClass;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getActionClass() {
        return actionClass;
    }

    public void setActionClass(String actionClass) {
        this.actionClass = actionClass;
    }

    public void setData()
    @Override
    public String toString() { return getActionClass() + "-" + getErrorCode(); }
}
