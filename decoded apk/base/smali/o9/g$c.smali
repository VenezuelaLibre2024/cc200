.class public final Lo9/g$c;
.super Lld/d;
.source ""


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
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lld/d;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.settings.SettingsCache"
    f = "SettingsCache.kt"
    l = {
        0x70
    }
    m = "updateConfigValue"
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lo9/g;

.field public j:I


# direct methods
.method public constructor <init>(Lo9/g;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo9/g;",
            "Ljd/d<",
            "-",
            "Lo9/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo9/g$c;->i:Lo9/g;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo9/g$c;->h:Ljava/lang/Object;

    iget p1, p0, Lo9/g$c;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo9/g$c;->j:I

    iget-object p1, p0, Lo9/g$c;->i:Lo9/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lo9/g;->b(Lo9/g;Lu0/d$a;Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
