.class public final synthetic Lw3/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lw3/g;


# direct methods
.method public synthetic constructor <init>(Lw3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/k;->h:Lw3/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw3/k;->h:Lw3/g;

    invoke-static {v0}, Lw3/h$h;->c(Lw3/g;)V

    return-void
.end method
