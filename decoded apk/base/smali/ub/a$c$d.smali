.class public Lub/a$c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/a$c;->b(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:D

.field public final synthetic i:Lub/a$c;


# direct methods
.method public constructor <init>(Lub/a$c;D)V
    .locals 0

    iput-object p1, p0, Lub/a$c$d;->i:Lub/a$c;

    iput-wide p2, p0, Lub/a$c$d;->h:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lub/a$c$d;->i:Lub/a$c;

    invoke-static {v0}, Lub/a$c;->e(Lub/a$c;)Lub/b;

    move-result-object v0

    iget-wide v1, p0, Lub/a$c$d;->h:D

    invoke-interface {v0, v1, v2}, Lub/b;->b(D)V

    return-void
.end method
