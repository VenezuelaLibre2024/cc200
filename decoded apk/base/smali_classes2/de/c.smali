.class public final synthetic Lde/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lce/i1;


# instance fields
.field public final synthetic h:Lde/d;

.field public final synthetic i:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lde/d;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/c;->h:Lde/d;

    iput-object p2, p0, Lde/c;->i:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, Lde/c;->h:Lde/d;

    iget-object v1, p0, Lde/c;->i:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lde/d;->M0(Lde/d;Ljava/lang/Runnable;)V

    return-void
.end method
