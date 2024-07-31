.class public final synthetic Lw2/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lw2/j;


# direct methods
.method public synthetic constructor <init>(Lw2/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/h;->a:Lw2/j;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw2/h;->a:Lw2/j;

    check-cast p1, Lw6/q;

    invoke-static {v0, p1}, Lw2/j;->g(Lw2/j;Lw6/q;)V

    return-void
.end method
