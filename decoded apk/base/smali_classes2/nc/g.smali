.class public final synthetic Lnc/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lnc/i;

.field public final synthetic i:Lpc/e;


# direct methods
.method public synthetic constructor <init>(Lnc/i;Lpc/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/g;->h:Lnc/i;

    iput-object p2, p0, Lnc/g;->i:Lpc/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnc/g;->h:Lnc/i;

    iget-object v1, p0, Lnc/g;->i:Lpc/e;

    invoke-static {v0, v1}, Lnc/i;->f(Lnc/i;Lpc/e;)V

    return-void
.end method
