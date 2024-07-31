.class public final synthetic Lf7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lf7/a;


# direct methods
.method public synthetic constructor <init>(Lf7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/b;->h:Lf7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf7/b;->h:Lf7/a;

    invoke-static {v0}, Lf7/a;->e(Lf7/a;)V

    return-void
.end method
