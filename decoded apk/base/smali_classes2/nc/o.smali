.class public final synthetic Lnc/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lnc/p;

.field public final synthetic i:Lnc/m;


# direct methods
.method public synthetic constructor <init>(Lnc/p;Lnc/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/o;->h:Lnc/p;

    iput-object p2, p0, Lnc/o;->i:Lnc/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnc/o;->h:Lnc/p;

    iget-object v1, p0, Lnc/o;->i:Lnc/m;

    invoke-static {v0, v1}, Lnc/p;->e(Lnc/p;Lnc/m;)V

    return-void
.end method
