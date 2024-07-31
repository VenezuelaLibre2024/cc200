.class public final Lm9/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/d0$b;
    }
.end annotation


# static fields
.field public static final f:Lm9/d0$b;


# instance fields
.field public final a:Lm9/j0;

.field public final b:Lsd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/a<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:Lm9/y;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/d0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/d0$b;-><init>(Ltd/g;)V

    sput-object v0, Lm9/d0;->f:Lm9/d0$b;

    return-void
.end method

.method public constructor <init>(Lm9/j0;Lsd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/j0;",
            "Lsd/a<",
            "Ljava/util/UUID;",
            ">;)V"
        }
    .end annotation

    const-string v0, "timeProvider"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuidGenerator"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/d0;->a:Lm9/j0;

    iput-object p2, p0, Lm9/d0;->b:Lsd/a;

    invoke-virtual {p0}, Lm9/d0;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm9/d0;->c:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Lm9/d0;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lm9/j0;Lsd/a;ILtd/g;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm9/d0$a;->h:Lm9/d0$a;

    :cond_0
    invoke-direct {p0, p1, p2}, Lm9/d0;-><init>(Lm9/j0;Lsd/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lm9/y;
    .locals 8

    iget v0, p0, Lm9/d0;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lm9/d0;->d:I

    new-instance v7, Lm9/y;

    if-nez v0, :cond_0

    iget-object v0, p0, Lm9/d0;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm9/d0;->b()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v2, v0

    iget-object v3, p0, Lm9/d0;->c:Ljava/lang/String;

    iget v4, p0, Lm9/d0;->d:I

    iget-object v0, p0, Lm9/d0;->a:Lm9/j0;

    invoke-interface {v0}, Lm9/j0;->a()J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lm9/y;-><init>(Ljava/lang/String;Ljava/lang/String;IJ)V

    iput-object v7, p0, Lm9/d0;->e:Lm9/y;

    invoke-virtual {p0}, Lm9/d0;->c()Lm9/y;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lm9/d0;->b:Lsd/a;

    invoke-interface {v0}, Lsd/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v0, "uuidGenerator().toString()"

    invoke-static {v1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "-"

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lae/n;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Lm9/y;
    .locals 1

    iget-object v0, p0, Lm9/d0;->e:Lm9/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "currentSession"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
