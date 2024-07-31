.class public final Lo9/c$b;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9/c;->d(Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.settings.RemoteSettings"
    f = "RemoteSettings.kt"
    l = {
        0xaa,
        0x4c,
        0x5e
    }
    m = "updateSettings"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lo9/c;

.field public l:I


# direct methods
.method public constructor <init>(Lo9/c;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo9/c;",
            "Ljd/d<",
            "-",
            "Lo9/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo9/c$b;->k:Lo9/c;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo9/c$b;->j:Ljava/lang/Object;

    iget p1, p0, Lo9/c$b;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo9/c$b;->l:I

    iget-object p1, p0, Lo9/c$b;->k:Lo9/c;

    invoke-virtual {p1, p0}, Lo9/c;->d(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
