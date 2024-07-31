.class public final Lce/h;
.super Lce/n1;
.source ""


# instance fields
.field public final p:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lce/n1;-><init>()V

    iput-object p1, p0, Lce/h;->p:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public W0()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lce/h;->p:Ljava/lang/Thread;

    return-object v0
.end method
