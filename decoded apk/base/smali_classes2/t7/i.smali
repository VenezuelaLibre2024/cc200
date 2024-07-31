.class public final synthetic Lt7/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lt7/k;


# direct methods
.method public synthetic constructor <init>(Lt7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/i;->a:Lt7/k;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lt7/i;->a:Lt7/k;

    invoke-static {v0, p1}, Lt7/k;->b(Lt7/k;Ljava/lang/Exception;)V

    return-void
.end method
