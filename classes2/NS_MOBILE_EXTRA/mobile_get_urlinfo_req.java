package NS_MOBILE_EXTRA;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class mobile_get_urlinfo_req
  extends JceStruct
{
  public String url;
  
  public mobile_get_urlinfo_req()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.url = "";
  }
  
  public mobile_get_urlinfo_req(String paramString)
  {
    this.url = "";
    this.url = paramString;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.url = paramJceInputStream.readString(0, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.url, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\NS_MOBILE_EXTRA\mobile_get_urlinfo_req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */