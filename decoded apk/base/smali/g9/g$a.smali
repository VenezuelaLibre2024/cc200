.class public Lg9/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg9/b1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/g;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg9/g;


# direct methods
.method public constructor <init>(Lg9/g;)V
    .locals 0

    iput-object p1, p0, Lg9/g$a;->a:Lg9/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg9/g$a;->a:Lg9/g;

    invoke-static {v0, p1}, Lg9/g;->access$000(Lg9/g;Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
