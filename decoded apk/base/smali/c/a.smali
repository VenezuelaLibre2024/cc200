.class public interface abstract Lc/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a$b;,
        Lc/a$a;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "android$support$v4$app$INotificationSideChannel"

    const/16 v1, 0x24

    const/16 v2, 0x2e

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract J0(Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public abstract P(Ljava/lang/String;)V
.end method

.method public abstract z1(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
.end method
