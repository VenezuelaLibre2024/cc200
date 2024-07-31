.class public Ln/j0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic h:Ln/j0;


# direct methods
.method public constructor <init>(Ln/j0;)V
    .locals 0

    iput-object p1, p0, Ln/j0$b;->h:Ln/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ln/j0$b;->h:Ln/j0;

    invoke-virtual {v0}, Ln/j0;->e()V

    return-void
.end method
