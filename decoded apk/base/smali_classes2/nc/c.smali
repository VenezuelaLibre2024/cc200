.class public final synthetic Lnc/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lnc/i;


# direct methods
.method public synthetic constructor <init>(Lnc/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/c;->h:Lnc/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lnc/c;->h:Lnc/i;

    invoke-static {v0}, Lnc/i;->d(Lnc/i;)V

    return-void
.end method
