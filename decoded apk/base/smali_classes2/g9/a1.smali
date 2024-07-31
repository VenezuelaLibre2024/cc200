.class public final synthetic Lg9/a1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lg9/e1$a;


# direct methods
.method public synthetic constructor <init>(Lg9/e1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/a1;->a:Lg9/e1$a;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lg9/a1;->a:Lg9/e1$a;

    invoke-static {v0, p1}, Lg9/b1;->a(Lg9/e1$a;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
