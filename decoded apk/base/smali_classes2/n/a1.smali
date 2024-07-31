.class public final synthetic Ln/a1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ln/b1;


# direct methods
.method public synthetic constructor <init>(Ln/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln/a1;->h:Ln/b1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln/a1;->h:Ln/b1;

    invoke-static {v0}, Ln/b1;->a(Ln/b1;)V

    return-void
.end method
