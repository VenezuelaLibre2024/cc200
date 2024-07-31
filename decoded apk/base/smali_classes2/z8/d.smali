.class public final synthetic Lz8/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz8/g;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lz8/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/d;->h:Lz8/g;

    iput-boolean p2, p0, Lz8/d;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz8/d;->h:Lz8/g;

    iget-boolean v1, p0, Lz8/d;->i:Z

    invoke-static {v0, v1}, Lz8/g;->d(Lz8/g;Z)V

    return-void
.end method
