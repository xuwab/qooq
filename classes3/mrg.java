import android.os.Bundle;
import android.os.Handler;
import com.tencent.biz.ProtoUtils.TroopProtocolObserver;
import com.tencent.mobileqq.activity.TroopInfoActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.troopinfo.TroopInfoData;
import java.util.List;
import tencent.im.oidb.cmd0x6f6.oidb_cmd0x6f6.GbarInfo;
import tencent.im.oidb.cmd0x6f6.oidb_cmd0x6f6.RspBody;
import tencent.im.oidb.cmd0x6f6.oidb_cmd0x6f6.RspInfo;

public class mrg
  extends ProtoUtils.TroopProtocolObserver
{
  public mrg(TroopInfoActivity paramTroopInfoActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if ((paramInt != 0) || (paramArrayOfByte == null)) {}
    for (;;)
    {
      return;
      try
      {
        paramBundle = new oidb_cmd0x6f6.RspBody();
        paramBundle.mergeFrom(paramArrayOfByte);
        paramArrayOfByte = paramBundle.rpt_msg_rsp_info.get();
        if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
        {
          paramArrayOfByte = (oidb_cmd0x6f6.RspInfo)paramArrayOfByte.get(0);
          if ((paramArrayOfByte != null) && (paramArrayOfByte.uint32_result.get() == 0))
          {
            this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.tribeId = paramArrayOfByte.stgbarinfo.uint32_bid.get();
            this.a.c = this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.tribeId;
            this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.tribeName = paramArrayOfByte.stgbarinfo.str_name.get().toStringUtf8();
            this.a.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(9);
            return;
          }
        }
      }
      catch (Exception paramArrayOfByte) {}
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */