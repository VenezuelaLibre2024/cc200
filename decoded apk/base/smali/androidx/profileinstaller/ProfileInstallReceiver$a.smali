.class public Landroidx/profileinstaller/ProfileInstallReceiver$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/profileinstaller/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/profileinstaller/ProfileInstallReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Landroidx/profileinstaller/ProfileInstallReceiver;


# direct methods
.method public constructor <init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V
    .locals 0

    iput-object p1, p0, Landroidx/profileinstaller/ProfileInstallReceiver$a;->a:Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;)V
    .locals 1

    sget-object v0, Landroidx/profileinstaller/c;->b:Landroidx/profileinstaller/c$c;

    invoke-interface {v0, p1, p2}, Landroidx/profileinstaller/c$c;->a(ILjava/lang/Object;)V

    return-void
.end method

.method public b(ILjava/lang/Object;)V
    .locals 1

    sget-object v0, Landroidx/profileinstaller/c;->b:Landroidx/profileinstaller/c$c;

    invoke-interface {v0, p1, p2}, Landroidx/profileinstaller/c$c;->b(ILjava/lang/Object;)V

    iget-object p2, p0, Landroidx/profileinstaller/ProfileInstallReceiver$a;->a:Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void
.end method
