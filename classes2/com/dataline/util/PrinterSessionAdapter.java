package com.dataline.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dataline.activities.PrinterActivity;
import com.dataline.util.widget.AsyncImageView;
import com.tencent.mobileqq.activity.aio.ChatBackground;
import com.tencent.mobileqq.app.DataLineHandler;
import com.tencent.mobileqq.app.PrinterHandler;
import com.tencent.mobileqq.data.PrinterItemMsgRecord;
import com.tencent.mobileqq.drawable.ChatBackgroundDrawable;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.theme.ThemeUtil;
import com.tencent.mobileqq.utils.BubbleContextMenu;
import com.tencent.mobileqq.utils.TimeFormatterUtils;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenu;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.BubblePopupWindow;
import do;
import dp;
import dq;
import dr;
import java.util.ArrayList;

public class PrinterSessionAdapter
  extends TimeAdapter
{
  public static String a;
  LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater = null;
  private View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener = new do(this);
  public View.OnLongClickListener a;
  public PrinterActivity a;
  public DataLineHandler a;
  public BubblePopupWindow a;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaLangString = "dataline.PrinterSessionAdapter";
  }
  
  public PrinterSessionAdapter(PrinterActivity paramPrinterActivity, DataLineHandler paramDataLineHandler)
  {
    this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler = null;
    this.jdField_a_of_type_AndroidViewView$OnLongClickListener = new dq(this);
    this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow = null;
    this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler = paramDataLineHandler;
    this.jdField_a_of_type_ComDatalineActivitiesPrinterActivity = paramPrinterActivity;
    this.jdField_a_of_type_AndroidViewLayoutInflater = LayoutInflater.from(paramPrinterActivity);
    this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.b();
    b();
  }
  
  public int a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.size();
  }
  
  public long a(int paramInt)
  {
    return ((PrinterItemMsgRecord)this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.get(paramInt)).time;
  }
  
  public boolean a(View paramView)
  {
    if ((this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow != null) && (this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow.g())) {
      return true;
    }
    QQCustomMenu localQQCustomMenu = new QQCustomMenu();
    paramView = (ItemHolder)paramView.getTag();
    Object localObject1 = (PrinterItemMsgRecord)paramView.a();
    if (localObject1 != null)
    {
      localObject2 = paramView.a().jdField_a_of_type_AndroidWidgetRelativeLayout;
      if (localObject2 == null) {
        return false;
      }
    }
    else
    {
      return false;
    }
    Object localObject2 = ((RelativeLayout)localObject2).getContext();
    localQQCustomMenu.a(2131305406, ((Context)localObject2).getString(2131362156));
    localObject1 = new dr(this, (PrinterItemMsgRecord)localObject1, (Context)localObject2);
    this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow = BubbleContextMenu.a(paramView.jdField_a_of_type_AndroidWidgetRelativeLayout, localQQCustomMenu, (View.OnClickListener)localObject1);
    this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow.a(new dp(this));
    return true;
  }
  
  public long b(int paramInt)
  {
    return ((PrinterItemMsgRecord)this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.get(paramInt)).uniseq;
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.size() > paramInt) {
      this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.size() > paramInt) {}
    for (paramViewGroup = (PrinterItemMsgRecord)this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a.a.get(paramInt);; paramViewGroup = null)
    {
      if (paramViewGroup == null) {
        return null;
      }
      ItemHolder localItemHolder;
      Object localObject;
      int i;
      if (paramView == null)
      {
        paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130903264, null);
        localItemHolder = new ItemHolder();
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)paramView.findViewById(2131297922));
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout.setTag(localItemHolder);
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout.setClickable(true);
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout.setLongClickable(true);
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout.setOnLongClickListener(this.jdField_a_of_type_AndroidViewView$OnLongClickListener);
        localItemHolder.jdField_a_of_type_AndroidWidgetRelativeLayout.setAddStatesFromChildren(true);
        localItemHolder.b((TextView)paramView.findViewById(2131297923));
        localObject = (RelativeLayout)paramView.findViewById(2131296385);
        localItemHolder.a().jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)localObject);
        localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView = ((AsyncImageView)paramView.findViewById(2131297880));
        localItemHolder.a().jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131297881));
        localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)paramView.findViewById(2131297885));
        localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setDefaultImage(2130843492);
        localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setIsDrawRound(false);
        localItemHolder.a((TextView)paramView.findViewById(2131297441));
        paramView.setTag(localItemHolder);
        localItemHolder.a(paramViewGroup);
        localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setIsDrawRound(false);
        localObject = FileUtil.a(paramViewGroup.filename);
        if (localObject != null) {
          break label641;
        }
        localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setImageResource(2130840398);
        localObject = paramViewGroup.filename;
        i = paramViewGroup.filename.lastIndexOf("/");
        if (i >= 0) {
          localObject = FileManagerUtil.d(paramViewGroup.filename.substring(i + 1));
        }
        localItemHolder.a().jdField_a_of_type_AndroidWidgetTextView.setText((CharSequence)localObject);
        switch (paramViewGroup.status)
        {
        }
      }
      for (;;)
      {
        if (ThemeUtil.isInNightMode(this.jdField_a_of_type_ComDatalineActivitiesPrinterActivity.app))
        {
          localObject = (ChatBackgroundDrawable)this.jdField_a_of_type_ComDatalineActivitiesPrinterActivity.a.getTag(2131296450);
          if (localObject != null)
          {
            i = ChatBackground.a(((ChatBackgroundDrawable)localObject).getBitmap());
            localItemHolder.a().setTextColor(ColorStateList.valueOf(i));
          }
        }
        if (QLog.isDevelopLevel()) {
          QLog.d("dataline.time", 4, "time[" + paramViewGroup.time + "], uniseq[" + paramViewGroup.uniseq + "], lastShowTime[" + this.jdField_a_of_type_Long + "], filename[" + paramViewGroup.filename + "], position[" + paramInt + "], mapShowTime[" + a(paramViewGroup.uniseq));
        }
        if (!a(paramViewGroup.uniseq)) {
          break label893;
        }
        paramViewGroup = TimeFormatterUtils.a(this.jdField_a_of_type_ComDatalineActivitiesPrinterActivity, 3, paramViewGroup.time * 1000L);
        localItemHolder.a().setVisibility(0);
        localItemHolder.a().setText(paramViewGroup);
        return paramView;
        localItemHolder = (ItemHolder)paramView.getTag();
        break;
        label641:
        localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setDefaultImage(FileManagerUtil.b((String)localObject));
        switch (FileManagerUtil.a((String)localObject))
        {
        default: 
          i = FileManagerUtil.b((String)localObject);
          if (i == 0) {
            break;
          }
          localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setImageResource(i);
          break;
        case 0: 
          localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setAsyncClipSize(128, 128);
          localItemHolder.a().jdField_a_of_type_ComDatalineUtilWidgetAsyncImageView.setAsyncImage(paramViewGroup.filename);
          break;
          localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
          localItemHolder.b().setText(2131362310);
          continue;
          localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
          localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar.setProgress((int)(paramViewGroup.progress * 100.0D));
          localItemHolder.b().setText(2131362311);
          continue;
          localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(4);
          localItemHolder.b().setText(2131362309);
          continue;
          localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(4);
          localItemHolder.b().setText(2131362312);
          continue;
          localItemHolder.a().jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(4);
          localItemHolder.b().setText(2131362313);
        }
      }
      label893:
      localItemHolder.a().setVisibility(8);
      return paramView;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\dataline\util\PrinterSessionAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */