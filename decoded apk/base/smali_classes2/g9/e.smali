.class public final synthetic Lg9/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lg9/g;

.field public final synthetic b:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lg9/g;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/e;->a:Lg9/g;

    iput-object p2, p0, Lg9/e;->b:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lg9/e;->a:Lg9/g;

    iget-object v1, p0, Lg9/e;->b:Landroid/content/Intent;

    invoke-static {v0, v1, p1}, Lg9/g;->a(Lg9/g;Landroid/content/Intent;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
