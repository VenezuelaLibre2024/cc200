.class public final Lo9/g$d;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9/g;->h(Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/l;",
        "Lsd/p<",
        "Lu0/a;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2"
    f = "SettingsCache.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic k:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic l:Lo9/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lu0/d$a;Lo9/g;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu0/d$a<",
            "TT;>;",
            "Lo9/g;",
            "Ljd/d<",
            "-",
            "Lo9/g$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo9/g$d;->j:Ljava/lang/Object;

    iput-object p2, p0, Lo9/g$d;->k:Lu0/d$a;

    iput-object p3, p0, Lo9/g$d;->l:Lo9/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lu0/a;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu0/a;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lo9/g$d;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lo9/g$d;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lo9/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljd/d<",
            "*>;)",
            "Ljd/d<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo9/g$d;

    iget-object v1, p0, Lo9/g$d;->j:Ljava/lang/Object;

    iget-object v2, p0, Lo9/g$d;->k:Lu0/d$a;

    iget-object v3, p0, Lo9/g$d;->l:Lo9/g;

    invoke-direct {v0, v1, v2, v3, p2}, Lo9/g$d;-><init>(Ljava/lang/Object;Lu0/d$a;Lo9/g;Ljd/d;)V

    iput-object p1, v0, Lo9/g$d;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu0/a;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lo9/g$d;->a(Lu0/a;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    iget v0, p0, Lo9/g$d;->h:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo9/g$d;->i:Ljava/lang/Object;

    check-cast p1, Lu0/a;

    iget-object v0, p0, Lo9/g$d;->j:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lo9/g$d;->k:Lu0/d$a;

    invoke-virtual {p1, v1, v0}, Lu0/a;->i(Lu0/d$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo9/g$d;->k:Lu0/d$a;

    invoke-virtual {p1, v0}, Lu0/a;->h(Lu0/d$a;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lo9/g$d;->l:Lo9/g;

    invoke-static {v0, p1}, Lo9/g;->c(Lo9/g;Lu0/d;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
