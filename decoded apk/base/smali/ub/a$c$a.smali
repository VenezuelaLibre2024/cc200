.class public Lub/a$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/a$c;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lub/a$c;


# direct methods
.method public constructor <init>(Lub/a$c;)V
    .locals 0

    iput-object p1, p0, Lub/a$c$a;->h:Lub/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lub/a$c$a;->h:Lub/a$c;

    invoke-static {v0}, Lub/a$c;->e(Lub/a$c;)Lub/b;

    move-result-object v0

    invoke-interface {v0}, Lub/b;->d()V

    return-void
.end method
