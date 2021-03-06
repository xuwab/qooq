package com.tencent.protofile.coupon;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class CouponProto$AddCouponFavourReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34 }, new String[] { "bid", "cid", "source_id", "city" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "" }, AddCouponFavourReq.class);
  public final PBUInt32Field bid = PBField.initUInt32(0);
  public final PBUInt32Field cid = PBField.initUInt32(0);
  public final PBStringField city = PBField.initString("");
  public final PBUInt32Field source_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\protofile\coupon\CouponProto$AddCouponFavourReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */