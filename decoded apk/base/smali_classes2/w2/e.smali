.class public final synthetic Lw2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lw2/s;


# direct methods
.method public synthetic constructor <init>(Lw2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/e;->a:Lw2/s;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lw2/e;->a:Lw2/s;

    invoke-static {v0, p1}, Lw2/j;->j(Lw2/s;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
