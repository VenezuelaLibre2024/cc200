.class Lio/flutter/app/FlutterActivityDelegate$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/view/FlutterView$FirstFrameListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/app/FlutterActivityDelegate;->addLaunchView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/app/FlutterActivityDelegate;


# direct methods
.method public constructor <init>(Lio/flutter/app/FlutterActivityDelegate;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/app/FlutterActivityDelegate$1;->this$0:Lio/flutter/app/FlutterActivityDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFirstFrame()V
    .locals 2

    iget-object v0, p0, Lio/flutter/app/FlutterActivityDelegate$1;->this$0:Lio/flutter/app/FlutterActivityDelegate;

    invoke-static {v0}, Lio/flutter/app/FlutterActivityDelegate;->access$000(Lio/flutter/app/FlutterActivityDelegate;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lio/flutter/app/FlutterActivityDelegate$1$1;

    invoke-direct {v1, p0}, Lio/flutter/app/FlutterActivityDelegate$1$1;-><init>(Lio/flutter/app/FlutterActivityDelegate$1;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object v0, p0, Lio/flutter/app/FlutterActivityDelegate$1;->this$0:Lio/flutter/app/FlutterActivityDelegate;

    invoke-static {v0}, Lio/flutter/app/FlutterActivityDelegate;->access$100(Lio/flutter/app/FlutterActivityDelegate;)Lio/flutter/view/FlutterView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/flutter/view/FlutterView;->removeFirstFrameListener(Lio/flutter/view/FlutterView$FirstFrameListener;)V

    return-void
.end method
