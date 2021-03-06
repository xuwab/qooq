package com.tencent.mobileqq.redtouch;

import android.os.Bundle;
import com.tencent.mobileqq.app.NumRedMsgHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.pb.getnumredmsg.NumRedMsg.NumMsgBusi;
import com.tencent.pb.getnumredmsg.NumRedMsg.NumMsgRspBody;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import mqq.app.MobileQQ;
import mqq.manager.Manager;
import uex;

public class NumRedMsgManager
  implements Manager
{
  public static final String a = "NumRedMsgManager";
  public NumRedMsgHandler a;
  protected QQAppInterface a;
  protected NumRedMsg.NumMsgRspBody a;
  public ConcurrentHashMap a;
  
  public NumRedMsgManager(QQAppInterface paramQQAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_ComTencentMobileqqAppNumRedMsgHandler = ((NumRedMsgHandler)paramQQAppInterface.a(56));
  }
  
  private void a(NumRedMsg.NumMsgRspBody paramNumMsgRspBody)
  {
    this.jdField_a_of_type_ComTencentPbGetnumredmsgNumRedMsg$NumMsgRspBody = paramNumMsgRspBody;
  }
  
  private void a(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("NumRedMsgManager", 2, paramString);
    }
  }
  
  private void a(long[] paramArrayOfLong, NumRedGetMsgCallback paramNumRedGetMsgCallback, String paramString, boolean paramBoolean)
  {
    ThreadManager.a(new uex(this, paramArrayOfLong, paramNumRedGetMsgCallback, paramBoolean, paramString), 5, null, false);
  }
  
  private boolean a()
  {
    return new File(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getFilesDir(), "NumRedMsgFileName_" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a()).exists();
  }
  
  private boolean a(NumRedMsg.NumMsgRspBody paramNumMsgRspBody)
  {
    boolean bool = FileUtils.a(new File(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getFilesDir(), "NumRedMsgFileName_" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a()).getAbsolutePath(), paramNumMsgRspBody.toByteArray(), false);
    if (bool) {
      a(paramNumMsgRspBody);
    }
    return bool;
  }
  
  private void b(NumRedMsg.NumMsgRspBody paramNumMsgRspBody)
  {
    if (paramNumMsgRspBody == null) {}
    NumRedMsg.NumMsgRspBody localNumMsgRspBody;
    List localList;
    do
    {
      return;
      localNumMsgRspBody = a();
      if (localNumMsgRspBody == null)
      {
        a(paramNumMsgRspBody);
        return;
      }
      localList = localNumMsgRspBody.rpt_num_red.get();
      if (localList == null)
      {
        a(paramNumMsgRspBody);
        return;
      }
      paramNumMsgRspBody = paramNumMsgRspBody.rpt_num_red.get();
    } while (paramNumMsgRspBody == null);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramNumMsgRspBody.size())
    {
      int j = 0;
      int k = 0;
      while (j < localList.size())
      {
        if (((NumRedMsg.NumMsgBusi)localList.get(j)).ui64_msgid.get() == ((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).ui64_msgid.get())
        {
          ((NumRedMsg.NumMsgBusi)localList.get(j)).str_content.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).str_content.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).str_ext.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).str_ext.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).str_missionid.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).str_missionid.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).str_path.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).str_path.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).str_url.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).str_url.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).ui_appid.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).ui_appid.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).ui_expire_time.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).ui_expire_time.get());
          ((NumRedMsg.NumMsgBusi)localList.get(j)).str_ret.set(((NumRedMsg.NumMsgBusi)paramNumMsgRspBody.get(i)).str_ret.get());
          k = 1;
        }
        j += 1;
      }
      if (k == 0) {
        localArrayList.add(paramNumMsgRspBody.get(i));
      }
      i += 1;
    }
    localList.addAll(localArrayList);
    a(localNumMsgRspBody);
  }
  
  public NumRedMsg.NumMsgRspBody a()
  {
    if (this.jdField_a_of_type_ComTencentPbGetnumredmsgNumRedMsg$NumMsgRspBody != null) {
      return this.jdField_a_of_type_ComTencentPbGetnumredmsgNumRedMsg$NumMsgRspBody;
    }
    NumRedMsg.NumMsgRspBody localNumMsgRspBody1 = new NumRedMsg.NumMsgRspBody();
    Object localObject = new File(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getFilesDir(), "NumRedMsgFileName_" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a());
    if (!((File)localObject).exists()) {
      a("numredmsg pb file does not exist");
    }
    try
    {
      ((File)localObject).createNewFile();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        try
        {
          localObject = FileUtils.a((File)localObject);
          if (localObject != null) {
            break;
          }
          a("Can not translate numredmsg pb file to byte");
          return null;
        }
        finally {}
        localIOException = localIOException;
        localIOException.printStackTrace();
      }
    }
    try
    {
      localNumMsgRspBody2.mergeFrom((byte[])localObject);
      a(localNumMsgRspBody2);
      return localNumMsgRspBody2;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      a("merge numredmsg file to rspbody fail");
    }
    return null;
  }
  
  public void a(NumRedGetMsgCallback paramNumRedGetMsgCallback)
  {
    if (paramNumRedGetMsgCallback == null) {}
    while (!this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(Integer.valueOf(paramNumRedGetMsgCallback.a))) {
      return;
    }
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.remove(Integer.valueOf(paramNumRedGetMsgCallback.a));
  }
  
  public void a(NumRedMsg.NumMsgRspBody paramNumMsgRspBody, ToServiceMsg paramToServiceMsg, boolean paramBoolean)
  {
    int i = paramToServiceMsg.extraData.getInt("NumMsgListenerKey");
    long[] arrayOfLong = paramToServiceMsg.extraData.getLongArray("NumMsgIDList");
    paramToServiceMsg = paramToServiceMsg.extraData.getString("NumMsgListenerCmd");
    if (paramBoolean)
    {
      if (paramNumMsgRspBody == null) {
        return;
      }
      if (a()) {
        break label87;
      }
      a(paramNumMsgRspBody);
    }
    for (;;)
    {
      paramNumMsgRspBody = (NumRedGetMsgCallback)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(Integer.valueOf(i));
      if (paramNumMsgRspBody == null) {
        break;
      }
      a(arrayOfLong, paramNumMsgRspBody, paramToServiceMsg, true);
      return;
      label87:
      b(paramNumMsgRspBody);
    }
  }
  
  public void a(long[] paramArrayOfLong, String paramString, NumRedGetMsgCallback paramNumRedGetMsgCallback)
  {
    a(paramArrayOfLong, paramNumRedGetMsgCallback, paramString, false);
  }
  
  public void onDestroy()
  {
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = null;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\redtouch\NumRedMsgManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */