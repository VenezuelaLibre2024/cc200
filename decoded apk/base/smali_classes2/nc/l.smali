.class public final synthetic Lnc/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lnc/m;

.field public final synthetic i:Lnc/k;


# direct methods
.method public synthetic constructor <init>(Lnc/m;Lnc/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/l;->h:Lnc/m;

    iput-object p2, p0, Lnc/l;->i:Lnc/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnc/l;->h:Lnc/m;

    iget-object v1, p0, Lnc/l;->i:Lnc/k;

    invoke-static {v0, v1}, Lnc/m;->a(Lnc/m;Lnc/k;)V

    return-void
.end method
