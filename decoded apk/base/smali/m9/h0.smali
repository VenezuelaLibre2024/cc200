.class public final Lm9/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm9/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/h0$a;
    }
.end annotation


# static fields
.field public static final c:Lm9/h0$a;


# instance fields
.field public final b:Ln7/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/h0$a;-><init>(Ltd/g;)V

    sput-object v0, Lm9/h0;->c:Lm9/h0$a;

    return-void
.end method

.method public constructor <init>(Ln7/g;)V
    .locals 1

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/h0;->b:Ln7/g;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V
    .locals 4

    const-string v0, "callback"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceConnection"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm9/h0;->b:Ln7/g;

    invoke-virtual {v0}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/firebase/sessions/SessionLifecycleService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "LifecycleServiceBinder"

    const-string v3, "Binding service to application."

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "ClientCallbackMessenger"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/16 p1, 0x41

    invoke-virtual {v0, v1, p2, p1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method
