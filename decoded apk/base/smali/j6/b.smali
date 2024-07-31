.class public final synthetic Lj6/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/q;


# instance fields
.field public final synthetic a:Lh6/w;


# direct methods
.method public synthetic constructor <init>(Lh6/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/b;->a:Lh6/w;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lj6/b;->a:Lh6/w;

    check-cast p1, Lj6/e;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget v1, Lj6/d;->d:I

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lj6/a;

    invoke-virtual {p1, v0}, Lj6/a;->c(Lh6/w;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method
