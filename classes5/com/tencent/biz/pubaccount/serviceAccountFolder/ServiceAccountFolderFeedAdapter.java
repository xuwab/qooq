package com.tencent.biz.pubaccount.serviceAccountFolder;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.biz.pubaccount.PublicAccountServlet;
import com.tencent.biz.pubaccount.util.PublicAccountUtil;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.activity.aio.item.PAWeatherItemBuilder;
import com.tencent.mobileqq.activity.recent.RecentFaceDecoder;
import com.tencent.mobileqq.activity.recent.cur.DragFrameLayout;
import com.tencent.mobileqq.activity.recent.cur.DragTextView;
import com.tencent.mobileqq.app.PublicAccountDataManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.AccountDetail;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.mp.mobileqq_mp.UnFollowRequest;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.text.QQText;
import com.tencent.mobileqq.util.FaceDecoder.DecodeTaskCompletionListener;
import com.tencent.mobileqq.utils.DeviceInfoUtil;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheetHelper;
import com.tencent.widget.CustomWidgetUtil;
import com.tencent.widget.SingleLineTextView;
import com.tencent.widget.SwipListView;
import icm;
import icn;
import ico;
import icp;
import icq;
import icr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mqq.app.NewIntent;
import mqq.os.MqqHandler;

public class ServiceAccountFolderFeedAdapter
  extends BaseAdapter
  implements View.OnClickListener, FaceDecoder.DecodeTaskCompletionListener
{
  private float jdField_a_of_type_Float;
  private ServiceAccountFolderActivity jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity;
  private RecentFaceDecoder jdField_a_of_type_ComTencentMobileqqActivityRecentRecentFaceDecoder;
  private DragFrameLayout jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private SwipListView jdField_a_of_type_ComTencentWidgetSwipListView;
  private final Object jdField_a_of_type_JavaLangObject;
  private final String jdField_a_of_type_JavaLangString;
  private HashMap jdField_a_of_type_JavaUtilHashMap;
  private List jdField_a_of_type_JavaUtilList;
  private float b;
  private float c;
  
  public ServiceAccountFolderFeedAdapter(QQAppInterface paramQQAppInterface, ServiceAccountFolderActivity paramServiceAccountFolderActivity, SwipListView paramSwipListView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = "ServiceAccountFolderFeedAdapter";
    this.jdField_a_of_type_JavaLangObject = new Object();
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity = paramServiceAccountFolderActivity;
    this.jdField_a_of_type_ComTencentWidgetSwipListView = paramSwipListView;
    this.jdField_a_of_type_JavaUtilList = new ArrayList();
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentRecentFaceDecoder = new RecentFaceDecoder(paramQQAppInterface, this, false);
    this.jdField_a_of_type_Float = paramServiceAccountFolderActivity.getResources().getDimension(2131494174);
    this.b = paramServiceAccountFolderActivity.getResources().getDimension(2131494175);
    this.c = (this.jdField_a_of_type_Float + this.b);
  }
  
  private void a(ServiceAccountFolderFeed paramServiceAccountFolderFeed)
  {
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderFeedAdapter", 2, "unfollow->uin:" + paramServiceAccountFolderFeed.jdField_b_of_type_JavaLangString);
    }
    this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.b(true);
    NewIntent localNewIntent = new NewIntent(this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity, PublicAccountServlet.class);
    localNewIntent.putExtra("cmd", "unfollow");
    mobileqq_mp.UnFollowRequest localUnFollowRequest = new mobileqq_mp.UnFollowRequest();
    localUnFollowRequest.uin.set((int)Long.parseLong(paramServiceAccountFolderFeed.jdField_b_of_type_JavaLangString));
    localNewIntent.putExtra("data", localUnFollowRequest.toByteArray());
    localNewIntent.setObserver(new ico(this, paramServiceAccountFolderFeed));
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.startServlet(localNewIntent);
    PublicAccountUtil.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramServiceAccountFolderFeed.jdField_b_of_type_JavaLangString);
  }
  
  private void a(ServiceAccountFolderFeed paramServiceAccountFolderFeed, int paramInt)
  {
    ActionSheet localActionSheet = (ActionSheet)ActionSheetHelper.a(this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity, null);
    localActionSheet.a(String.format(this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.getResources().getString(2131364548), new Object[] { paramServiceAccountFolderFeed.jdField_d_of_type_JavaLangString }));
    localActionSheet.a(2131364502, 3);
    localActionSheet.d(2131367262);
    localActionSheet.a(new icn(this, paramServiceAccountFolderFeed, paramInt, localActionSheet));
    localActionSheet.show();
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderFeedAdapter", 2, "showActionSheet->uin:" + paramServiceAccountFolderFeed.jdField_b_of_type_JavaLangString + ", name:" + paramServiceAccountFolderFeed.jdField_d_of_type_JavaLangString);
    }
  }
  
  private void a(icr paramicr, int paramInt, View paramView)
  {
    int j = 0;
    ServiceAccountFolderFeed localServiceAccountFolderFeed = (ServiceAccountFolderFeed)getItem(paramInt);
    if (localServiceAccountFolderFeed == null) {
      return;
    }
    boolean bool = a(localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString);
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderFeedAdapter", 2, "updateItemContent->uin:" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString + ", isFollow:" + bool);
    }
    Object localObject1;
    if (bool)
    {
      paramicr.jdField_a_of_type_AndroidWidgetButton.setVisibility(0);
      paramView.setTag(-3, Integer.valueOf((int)this.c));
      paramicr.jdField_a_of_type_JavaLangString = localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString;
      if (this.jdField_a_of_type_ComTencentMobileqqActivityRecentRecentFaceDecoder != null)
      {
        localObject1 = this.jdField_a_of_type_ComTencentMobileqqActivityRecentRecentFaceDecoder.a(1008, localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString);
        paramicr.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable((Drawable)localObject1);
      }
      paramicr.jdField_a_of_type_ComTencentWidgetSingleLineTextView.setCompoundDrawablesWithIntrinsicBounds(0, localServiceAccountFolderFeed.jdField_c_of_type_Int);
      paramicr.jdField_a_of_type_ComTencentWidgetSingleLineTextView.setText(localServiceAccountFolderFeed.jdField_d_of_type_JavaLangString);
      paramicr.jdField_a_of_type_ComTencentWidgetSingleLineTextView.setExtendText(localServiceAccountFolderFeed.jdField_c_of_type_JavaLangString, 0);
      if (localServiceAccountFolderFeed.jdField_e_of_type_Int != 4) {
        break label588;
      }
    }
    label588:
    for (paramInt = 2130838409;; paramInt = 0)
    {
      paramicr.jdField_b_of_type_ComTencentWidgetSingleLineTextView.setCompoundDrawablesWithIntrinsicBounds(paramInt, 0);
      paramInt = localServiceAccountFolderFeed.jdField_d_of_type_Int;
      Object localObject2 = localServiceAccountFolderFeed.jdField_e_of_type_JavaLangString;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "";
      }
      localObject2 = localObject1;
      if (((String)localObject1).length() > 0)
      {
        localObject2 = localObject1;
        if (!((String)localObject1).endsWith(" ")) {
          localObject2 = (String)localObject1 + " ";
        }
      }
      if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (paramInt != 0)) {
        paramicr.jdField_b_of_type_ComTencentWidgetSingleLineTextView.setExtendTextColor(ColorStateList.valueOf(paramInt), 1);
      }
      paramicr.jdField_b_of_type_ComTencentWidgetSingleLineTextView.setExtendText((String)localObject2, 1);
      try
      {
        paramicr.jdField_b_of_type_ComTencentWidgetSingleLineTextView.setText(new QQText(localServiceAccountFolderFeed.jdField_a_of_type_JavaLangCharSequence, 3, 16));
        paramInt = localServiceAccountFolderFeed.jdField_b_of_type_Int;
        i = localServiceAccountFolderFeed.jdField_a_of_type_Int;
        if (paramInt > 0) {
          if (i == 0)
          {
            paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setDragViewType(-1, paramView);
            paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setOnModeChangeListener(null);
            i = 0;
            paramInt = 0;
            CustomWidgetUtil.a(paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView, paramInt, j, i, 99, null);
            if (!AppSetting.j) {
              break;
            }
            paramView = new StringBuilder();
            paramView.append(paramicr.jdField_a_of_type_ComTencentWidgetSingleLineTextView.a()).append(',').append(paramicr.jdField_b_of_type_ComTencentWidgetSingleLineTextView.a());
            paramicr.jdField_a_of_type_AndroidWidgetRelativeLayout.setContentDescription(paramView.toString());
            return;
            paramicr.jdField_a_of_type_AndroidWidgetButton.setVisibility(8);
            paramView.setTag(-3, Integer.valueOf((int)this.b));
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int i;
          localException.printStackTrace();
          paramicr.jdField_b_of_type_ComTencentWidgetSingleLineTextView.setText(localServiceAccountFolderFeed.jdField_a_of_type_JavaLangCharSequence + " ");
          continue;
          if (i == 2)
          {
            paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setDragViewType(-1, paramView);
            paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setOnModeChangeListener(null);
            paramInt = 1;
            i = 0;
          }
          else
          {
            i = 2130843325;
            paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setDragViewType(0, paramView);
            paramicr.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setOnModeChangeListener(this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout);
            j = paramInt;
            paramInt = 3;
            continue;
            i = 0;
            paramInt = 0;
          }
        }
      }
    }
  }
  
  private void a(icr paramicr, String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderFeedAdapter", 2, "setHolderIcon->uin:" + paramString);
    }
    Bitmap localBitmap = (Bitmap)this.jdField_a_of_type_JavaUtilHashMap.get(paramString);
    if (localBitmap == null)
    {
      paramicr.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(this.jdField_a_of_type_ComTencentMobileqqActivityRecentRecentFaceDecoder.a(1008, paramString));
      return;
    }
    paramicr.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap(localBitmap);
  }
  
  private boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    AccountDetail localAccountDetail;
    do
    {
      PublicAccountDataManager localPublicAccountDataManager;
      do
      {
        do
        {
          return false;
          localPublicAccountDataManager = (PublicAccountDataManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(55);
        } while (localPublicAccountDataManager == null);
        localAccountDetail = localPublicAccountDataManager.b(paramString);
      } while (((localAccountDetail != null) && (!localAccountDetail.isShowFollowButton)) || ((localAccountDetail == null) && ("1770946116".equals(paramString))));
      if (localPublicAccountDataManager.c(paramString) != null) {
        return true;
      }
    } while (localAccountDetail == null);
    if (localAccountDetail.followType == 1) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderFeedAdapter", 2, "showNetworkErrorToast");
    }
    Toast.makeText(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication(), 2131364487, 0).show();
  }
  
  private void b(ServiceAccountFolderFeed paramServiceAccountFolderFeed)
  {
    String str = paramServiceAccountFolderFeed.jdField_b_of_type_JavaLangString;
    if (QLog.isColorLevel()) {
      QLog.d("ServiceAccountFolderFeedAdapter", 2, "updateUnfollowInfo->uin:" + str);
    }
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      this.jdField_a_of_type_JavaUtilList.remove(paramServiceAccountFolderFeed);
      notifyDataSetChanged();
      ThreadManager.b(new icp(this, paramServiceAccountFolderFeed));
      if ((getCount() == 0) && (this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity != null) && (this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.isResume())) {
        this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.a(true);
      }
      ThreadManager.b().postDelayed(new icq(this, str, paramServiceAccountFolderFeed), 10L);
      return;
    }
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentRecentFaceDecoder.a();
    this.jdField_a_of_type_JavaUtilHashMap.clear();
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      this.jdField_a_of_type_JavaUtilList.clear();
      return;
    }
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramString == null) || (paramString.length() == 0)) {}
    do
    {
      return;
      this.jdField_a_of_type_JavaUtilHashMap.put(paramString, paramBitmap);
      paramInt2 = this.jdField_a_of_type_ComTencentWidgetSwipListView.getChildCount();
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        paramBitmap = this.jdField_a_of_type_ComTencentWidgetSwipListView.getChildAt(paramInt1).getTag();
        if ((paramBitmap != null) && ((paramBitmap instanceof icr)))
        {
          paramBitmap = (icr)paramBitmap;
          if (paramString.equals(paramBitmap.jdField_a_of_type_JavaLangString)) {
            a(paramBitmap, paramString);
          }
        }
        paramInt1 += 1;
      }
    } while (!QLog.isColorLevel());
    QLog.d("ServiceAccountFolderFeedAdapter", 2, "onDecodeTaskCompleted->uin:" + paramString);
  }
  
  public void a(DragFrameLayout paramDragFrameLayout)
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragFrameLayout = paramDragFrameLayout;
  }
  
  public void a(List paramList)
  {
    if (paramList != null) {}
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      this.jdField_a_of_type_JavaUtilList.clear();
      this.jdField_a_of_type_JavaUtilList.addAll(paramList);
      notifyDataSetChanged();
      if (QLog.isColorLevel()) {
        QLog.d("ServiceAccountFolderFeedAdapter", 2, "setDataList->DataSetChanged");
      }
      return;
    }
  }
  
  public int getCount()
  {
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      int i = this.jdField_a_of_type_JavaUtilList.size();
      return i;
    }
  }
  
  public Object getItem(int paramInt)
  {
    synchronized (this.jdField_a_of_type_JavaLangObject)
    {
      if (paramInt >= getCount()) {
        return null;
      }
      Object localObject2 = this.jdField_a_of_type_JavaUtilList.get(paramInt);
      return localObject2;
    }
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = null;
    paramViewGroup = (ViewGroup)localObject1;
    if (paramView != null)
    {
      paramViewGroup = (ViewGroup)localObject1;
      if ((paramView.getTag() instanceof icr)) {
        paramViewGroup = (icr)paramView.getTag();
      }
    }
    localObject1 = paramViewGroup;
    if (paramViewGroup == null)
    {
      localObject1 = new icr(this);
      paramView = LayoutInflater.from(this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity).inflate(2130903493, null);
      ((icr)localObject1).jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)paramView.findViewById(2131298737));
      ((icr)localObject1).jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131296790));
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView = ((SingleLineTextView)paramView.findViewById(2131297123));
      ((icr)localObject1).jdField_b_of_type_ComTencentWidgetSingleLineTextView = ((SingleLineTextView)paramView.findViewById(2131298722));
      ((icr)localObject1).jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView = ((DragTextView)paramView.findViewById(2131298785));
      ((icr)localObject1).jdField_a_of_type_AndroidWidgetButton = ((Button)paramView.findViewById(2131298740));
      ((icr)localObject1).jdField_b_of_type_AndroidWidgetButton = ((Button)paramView.findViewById(2131298786));
      Object localObject2 = this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.getResources();
      float f = DeviceInfoUtil.a();
      paramViewGroup = ((Resources)localObject2).getColorStateList(2131428305);
      localObject2 = ((Resources)localObject2).getColorStateList(2131428267);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setTextColor((ColorStateList)localObject2);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setTextSize(17.0F);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setExtendTextColor(paramViewGroup, 0);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setExtendTextSize(12.0F, 0);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setCompoundDrawablePadding((int)(3.0F * f));
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setExtendTextPadding((int)(5.0F * f), 2);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setExtendTextColor(paramViewGroup, 2);
      ((icr)localObject1).jdField_a_of_type_ComTencentWidgetSingleLineTextView.setExtendTextSize(17.0F, 2);
      ((icr)localObject1).jdField_b_of_type_ComTencentWidgetSingleLineTextView.setTextSize(14.0F);
      ((icr)localObject1).jdField_b_of_type_ComTencentWidgetSingleLineTextView.setExtendTextPadding((int)(f * 2.0F), 1);
      ((icr)localObject1).jdField_b_of_type_ComTencentWidgetSingleLineTextView.setExtendTextSize(14.0F, 1);
      ((icr)localObject1).jdField_a_of_type_AndroidWidgetRelativeLayout.setOnClickListener(this);
      ((icr)localObject1).jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
      ((icr)localObject1).jdField_b_of_type_AndroidWidgetButton.setOnClickListener(this);
      paramView.setTag(localObject1);
    }
    ((icr)localObject1).jdField_a_of_type_AndroidWidgetRelativeLayout.setTag(Integer.valueOf(paramInt));
    ((icr)localObject1).jdField_a_of_type_AndroidWidgetButton.setTag(Integer.valueOf(paramInt));
    ((icr)localObject1).jdField_b_of_type_AndroidWidgetButton.setTag(Integer.valueOf(paramInt));
    ((icr)localObject1).jdField_a_of_type_ComTencentMobileqqActivityRecentCurDragTextView.setTag(Integer.valueOf(paramInt));
    a((icr)localObject1, paramInt, paramView);
    return paramView;
  }
  
  public void onClick(View arg1)
  {
    int k = ((Integer)???.getTag()).intValue();
    ServiceAccountFolderFeed localServiceAccountFolderFeed = (ServiceAccountFolderFeed)getItem(k);
    if (localServiceAccountFolderFeed == null) {
      return;
    }
    int i = localServiceAccountFolderFeed.jdField_b_of_type_Int;
    int j = localServiceAccountFolderFeed.jdField_a_of_type_Int;
    if (j != 1) {
      i = 0;
    }
    for (;;)
    {
      long l = ServiceAccountFolderManager.a().a(localServiceAccountFolderFeed);
      switch (???.getId())
      {
      default: 
        return;
      case 2131298737: 
        ??? = new Intent(this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity, ChatActivity.class);
        ???.putExtra("uintype", 1008);
        ???.putExtra("uin", localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString);
        ???.putExtra("uinname", localServiceAccountFolderFeed.jdField_d_of_type_JavaLangString);
        ???.putExtra("start_time", System.currentTimeMillis());
        ???.putExtra("red_hot_count", localServiceAccountFolderFeed.jdField_b_of_type_Int);
        this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.startActivity(???);
        if (QLog.isColorLevel()) {
          QLog.d("ServiceAccountFolderFeedAdapter", 2, "onClickFeedItem->uin:" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString + ", name:" + localServiceAccountFolderFeed.jdField_d_of_type_JavaLangString);
        }
        ??? = "0X80067F1";
        if (j == 1) {
          ??? = "0X80067EF";
        }
        for (;;)
        {
          ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Pb_account_lifeservice", "" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString, ???, ???, 0, 0, "" + j, "" + l, "" + (k + 1), "" + i);
          if (!PAWeatherItemBuilder.a(localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString)) {
            break;
          }
          ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "P_CliOper", "weather_public_account", "", "weather_public_account", "brief_weather_click", 0, 0, "", "", "6.5.5", "");
          return;
          if (j == 2) {
            ??? = "0X80067F0";
          }
        }
      case 2131298740: 
        if (QLog.isColorLevel()) {
          QLog.d("ServiceAccountFolderFeedAdapter", 2, "onClickMenuUnfollow->uin:" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString + ", name:" + localServiceAccountFolderFeed.jdField_d_of_type_JavaLangString);
        }
        a(localServiceAccountFolderFeed, k);
        return;
      }
      if (QLog.isColorLevel()) {
        QLog.d("ServiceAccountFolderFeedAdapter", 2, "onClickMenuDelete->uin:" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString + ", name:" + localServiceAccountFolderFeed.jdField_d_of_type_JavaLangString);
      }
      for (;;)
      {
        synchronized (this.jdField_a_of_type_JavaLangObject)
        {
          this.jdField_a_of_type_JavaUtilList.remove(localServiceAccountFolderFeed);
          notifyDataSetChanged();
          ThreadManager.b(new icm(this, localServiceAccountFolderFeed));
          if ((getCount() == 0) && (this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity != null) && (this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.isResume())) {
            this.jdField_a_of_type_ComTencentBizPubaccountServiceAccountFolderServiceAccountFolderActivity.a(true);
          }
          if (j == 2)
          {
            j = 1;
            ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Pb_account_lifeservice", "" + localServiceAccountFolderFeed.jdField_b_of_type_JavaLangString, "0X80067F3", "0X80067F3", 0, 0, "" + j, "" + i, "" + (k + 1), "" + l);
            return;
          }
        }
        j = 0;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\pubaccount\serviceAccountFolder\ServiceAccountFolderFeedAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */