.class public final Lo9/f$c;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9/f;->g(Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.settings.SessionsSettings"
    f = "SessionsSettings.kt"
    l = {
        0x8a,
        0x8b
    }
    m = "updateSettings"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lo9/f;

.field public k:I


# direct methods
.method public constructor <init>(Lo9/f;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo9/f;",
            "Ljd/d<",
            "-",
            "Lo9/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo9/f$c;->j:Lo9/f;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo9/f$c;->i:Ljava/lang/Object;

    iget p1, p0, Lo9/f$c;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo9/f$c;->k:I

    iget-object p1, p0, Lo9/f$c;->j:Lo9/f;

    invoke-virtual {p1, p0}, Lo9/f;->g(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
