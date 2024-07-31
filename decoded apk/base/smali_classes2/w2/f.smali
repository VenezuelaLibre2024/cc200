.class public final synthetic Lw2/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lv2/a;


# direct methods
.method public synthetic constructor <init>(Lv2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/f;->a:Lv2/a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lw2/f;->a:Lv2/a;

    invoke-static {v0, p1}, Lw2/j;->i(Lv2/a;Ljava/lang/Exception;)V

    return-void
.end method
