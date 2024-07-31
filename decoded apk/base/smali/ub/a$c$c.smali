.class public Lub/a$c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/a$c;->c(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/lang/Throwable;

.field public final synthetic i:Lub/a$c;


# direct methods
.method public constructor <init>(Lub/a$c;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lub/a$c$c;->i:Lub/a$c;

    iput-object p2, p0, Lub/a$c$c;->h:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lub/a$c$c;->i:Lub/a$c;

    invoke-static {v0}, Lub/a$c;->e(Lub/a$c;)Lub/b;

    move-result-object v0

    iget-object v1, p0, Lub/a$c$c;->h:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lub/b;->c(Ljava/lang/Throwable;)V

    return-void
.end method
