.class public final synthetic Lp9/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp9/l0$a;


# instance fields
.field public final synthetic a:Lp9/e0;


# direct methods
.method public synthetic constructor <init>(Lp9/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/b0;->a:Lp9/e0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lp9/b0;->a:Lp9/e0;

    check-cast p1, Lcom/google/android/gms/tasks/OnCanceledListener;

    check-cast p2, Lp9/e0$a;

    invoke-static {v0, p1, p2}, Lp9/e0;->c(Lp9/e0;Lcom/google/android/gms/tasks/OnCanceledListener;Lp9/e0$a;)V

    return-void
.end method
