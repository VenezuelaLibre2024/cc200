.class public final Lk5/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Li7/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Li7/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Li7/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Li7/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "\\s+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lk5/b;->d:Ljava/util/regex/Pattern;

    const-string v0, "auto"

    const-string v1, "none"

    invoke-static {v0, v1}, Li7/x;->u(Ljava/lang/Object;Ljava/lang/Object;)Li7/x;

    move-result-object v0

    sput-object v0, Lk5/b;->e:Li7/x;

    const-string v0, "dot"

    const-string v1, "sesame"

    const-string v2, "circle"

    invoke-static {v0, v1, v2}, Li7/x;->v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Li7/x;

    move-result-object v0

    sput-object v0, Lk5/b;->f:Li7/x;

    const-string v0, "filled"

    const-string v1, "open"

    invoke-static {v0, v1}, Li7/x;->u(Ljava/lang/Object;Ljava/lang/Object;)Li7/x;

    move-result-object v0

    sput-object v0, Lk5/b;->g:Li7/x;

    const-string v0, "after"

    const-string v1, "before"

    const-string v2, "outside"

    invoke-static {v0, v1, v2}, Li7/x;->v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Li7/x;

    move-result-object v0

    sput-object v0, Lk5/b;->h:Li7/x;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk5/b;->a:I

    iput p2, p0, Lk5/b;->b:I

    iput p3, p0, Lk5/b;->c:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Lk5/b;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lh7/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lk5/b;->d:Ljava/util/regex/Pattern;

    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/util/regex/Pattern;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Li7/x;->o([Ljava/lang/Object;)Li7/x;

    move-result-object p0

    invoke-static {p0}, Lk5/b;->b(Li7/x;)Lk5/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Li7/x;)Lk5/b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/x<",
            "Ljava/lang/String;",
            ">;)",
            "Lk5/b;"
        }
    .end annotation

    sget-object v0, Lk5/b;->h:Li7/x;

    invoke-static {v0, p0}, Li7/y0;->e(Ljava/util/Set;Ljava/util/Set;)Li7/y0$e;

    move-result-object v0

    const-string v1, "outside"

    invoke-static {v0, v1}, Li7/b0;->c(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x5305c081

    const/4 v4, 0x2

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v2, v3, :cond_2

    const v3, -0x41ecca5b

    if-eq v2, v3, :cond_1

    const v1, 0x58705dc

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "after"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v6

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v7

    goto :goto_1

    :cond_2
    const-string v1, "before"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v4

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v5

    :goto_1
    if-eqz v0, :cond_5

    if-eq v0, v7, :cond_4

    move v0, v7

    goto :goto_2

    :cond_4
    const/4 v0, -0x2

    goto :goto_2

    :cond_5
    move v0, v4

    :goto_2
    sget-object v1, Lk5/b;->e:Li7/x;

    invoke-static {v1, p0}, Li7/y0;->e(Ljava/util/Set;Ljava/util/Set;)Li7/y0$e;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x2dddaf

    if-eq v1, v2, :cond_7

    const v2, 0x33af38

    if-eq v1, v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "none"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    move v7, v6

    goto :goto_4

    :cond_7
    const-string v1, "auto"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    move v7, v5

    :goto_4
    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    move v5, v6

    :goto_5
    new-instance p0, Lk5/b;

    invoke-direct {p0, v5, v6, v0}, Lk5/b;-><init>(III)V

    return-object p0

    :cond_a
    sget-object v1, Lk5/b;->g:Li7/x;

    invoke-static {v1, p0}, Li7/y0;->e(Ljava/util/Set;Ljava/util/Set;)Li7/y0$e;

    move-result-object v1

    sget-object v2, Lk5/b;->f:Li7/x;

    invoke-static {v2, p0}, Li7/y0;->e(Ljava/util/Set;Ljava/util/Set;)Li7/y0$e;

    move-result-object p0

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance p0, Lk5/b;

    invoke-direct {p0, v5, v6, v0}, Lk5/b;-><init>(III)V

    return-object p0

    :cond_b
    const-string v2, "filled"

    invoke-static {v1, v2}, Li7/b0;->c(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v8, -0x4bf7529e

    if-eq v3, v8, :cond_d

    const v2, 0x34264a

    if-eq v3, v2, :cond_c

    goto :goto_6

    :cond_c
    const-string v2, "open"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    move v1, v6

    goto :goto_7

    :cond_d
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    move v1, v7

    goto :goto_7

    :cond_e
    :goto_6
    move v1, v5

    :goto_7
    if-eqz v1, :cond_f

    move v1, v7

    goto :goto_8

    :cond_f
    move v1, v4

    :goto_8
    const-string v2, "circle"

    invoke-static {p0, v2}, Li7/b0;->c(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v8, -0x51134330

    if-eq v3, v8, :cond_12

    const v2, -0x35fdaa48    # -2135406.0f

    if-eq v3, v2, :cond_11

    const v2, 0x18549

    if-eq v3, v2, :cond_10

    goto :goto_9

    :cond_10
    const-string v2, "dot"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_13

    move v5, v6

    goto :goto_9

    :cond_11
    const-string v2, "sesame"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_13

    move v5, v7

    goto :goto_9

    :cond_12
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_13

    move v5, v4

    :cond_13
    :goto_9
    if-eqz v5, :cond_15

    if-eq v5, v7, :cond_14

    move v4, v7

    goto :goto_a

    :cond_14
    const/4 v4, 0x3

    :cond_15
    :goto_a
    new-instance p0, Lk5/b;

    invoke-direct {p0, v4, v1, v0}, Lk5/b;-><init>(III)V

    return-object p0
.end method
