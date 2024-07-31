.class public final synthetic Lt7/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lt7/k;


# direct methods
.method public synthetic constructor <init>(Lt7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/j;->h:Lt7/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lt7/j;->h:Lt7/k;

    invoke-static {v0}, Lt7/k;->a(Lt7/k;)V

    return-void
.end method
