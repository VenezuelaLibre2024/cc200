.class public final Ls3/q;
.super Ls3/x2;
.source ""


# static fields
.field public static final A:Ljava/lang/String;

.field public static final B:Ljava/lang/String;

.field public static final C:Ljava/lang/String;

.field public static final w:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Ljava/lang/String;

.field public static final y:Ljava/lang/String;

.field public static final z:Ljava/lang/String;


# instance fields
.field public final p:I

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:Ls3/m1;

.field public final t:I

.field public final u:Lu4/s;

.field public final v:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls3/p;->a:Ls3/p;

    sput-object v0, Ls3/q;->w:Ls3/h$a;

    const/16 v0, 0x3e9

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/q;->x:Ljava/lang/String;

    const/16 v0, 0x3ea

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/q;->y:Ljava/lang/String;

    const/16 v0, 0x3eb

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/q;->z:Ljava/lang/String;

    const/16 v0, 0x3ec

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/q;->A:Ljava/lang/String;

    const/16 v0, 0x3ed

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/q;->B:Ljava/lang/String;

    const/16 v0, 0x3ee

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/q;->C:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;I)V
    .locals 10

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v4, p3

    invoke-direct/range {v0 .. v9}, Ls3/q;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILs3/m1;IZ)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILs3/m1;IZ)V
    .locals 14

    move v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    move/from16 v3, p6

    move-object/from16 v4, p7

    move/from16 v5, p8

    invoke-static/range {v0 .. v5}, Ls3/q;->j(ILjava/lang/String;Ljava/lang/String;ILs3/m1;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    const/4 v10, 0x0

    move-object v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move v5, p1

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v13, p9

    invoke-direct/range {v1 .. v13}, Ls3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILs3/m1;ILu4/s;JZ)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0, p1}, Ls3/x2;-><init>(Landroid/os/Bundle;)V

    sget-object v0, Ls3/q;->x:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/q;->p:I

    sget-object v0, Ls3/q;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls3/q;->q:Ljava/lang/String;

    sget-object v0, Ls3/q;->z:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/q;->r:I

    sget-object v0, Ls3/q;->A:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sget-object v2, Ls3/m1;->w0:Ls3/h$a;

    invoke-interface {v2, v0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Ls3/m1;

    :goto_0
    iput-object v0, p0, Ls3/q;->s:Ls3/m1;

    sget-object v0, Ls3/q;->B:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/q;->t:I

    sget-object v0, Ls3/q;->C:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ls3/q;->v:Z

    iput-object v1, p0, Ls3/q;->u:Lu4/s;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILs3/m1;ILu4/s;JZ)V
    .locals 9

    move-object v6, p0

    move v7, p4

    move/from16 v8, p12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide/from16 v4, p10

    invoke-direct/range {v0 .. v5}, Ls3/x2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz v8, :cond_1

    if-ne v7, v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    invoke-static {v2}, Lp5/a;->a(Z)V

    if-nez p2, :cond_2

    const/4 v2, 0x3

    if-ne v7, v2, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    invoke-static {v0}, Lp5/a;->a(Z)V

    iput v7, v6, Ls3/q;->p:I

    move-object v0, p5

    iput-object v0, v6, Ls3/q;->q:Ljava/lang/String;

    move v0, p6

    iput v0, v6, Ls3/q;->r:I

    move-object/from16 v0, p7

    iput-object v0, v6, Ls3/q;->s:Ls3/m1;

    move/from16 v0, p8

    iput v0, v6, Ls3/q;->t:I

    move-object/from16 v0, p9

    iput-object v0, v6, Ls3/q;->u:Lu4/s;

    iput-boolean v8, v6, Ls3/q;->v:Z

    return-void
.end method

.method public static synthetic d(Landroid/os/Bundle;)Ls3/q;
    .locals 1

    new-instance v0, Ls3/q;

    invoke-direct {v0, p0}, Ls3/q;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Throwable;Ljava/lang/String;ILs3/m1;IZI)Ls3/q;
    .locals 11

    new-instance v10, Ls3/q;

    if-nez p3, :cond_0

    const/4 v0, 0x4

    move v8, v0

    goto :goto_0

    :cond_0
    move v8, p4

    :goto_0
    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v0, v10

    move-object v2, p0

    move/from16 v4, p6

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move/from16 v9, p5

    invoke-direct/range {v0 .. v9}, Ls3/q;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILs3/m1;IZ)V

    return-object v10
.end method

.method public static g(Ljava/io/IOException;I)Ls3/q;
    .locals 2

    new-instance v0, Ls3/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ls3/q;-><init>(ILjava/lang/Throwable;I)V

    return-object v0
.end method

.method public static h(Ljava/lang/RuntimeException;)Ls3/q;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/16 v0, 0x3e8

    invoke-static {p0, v0}, Ls3/q;->i(Ljava/lang/RuntimeException;I)Ls3/q;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/RuntimeException;I)Ls3/q;
    .locals 2

    new-instance v0, Ls3/q;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ls3/q;-><init>(ILjava/lang/Throwable;I)V

    return-object v0
.end method

.method public static j(ILjava/lang/String;Ljava/lang/String;ILs3/m1;I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 p2, 0x3

    if-eq p0, p2, :cond_0

    const-string p0, "Unexpected runtime error"

    goto :goto_0

    :cond_0
    const-string p0, "Remote error"

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " error, index="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", format="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", format_supported="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p5}, Lp5/n0;->W(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string p0, "Source error"

    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public e(Lu4/s;)Ls3/q;
    .locals 14

    new-instance v13, Ls3/q;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    iget v3, p0, Ls3/x2;->h:I

    iget v4, p0, Ls3/q;->p:I

    iget-object v5, p0, Ls3/q;->q:Ljava/lang/String;

    iget v6, p0, Ls3/q;->r:I

    iget-object v7, p0, Ls3/q;->s:Ls3/m1;

    iget v8, p0, Ls3/q;->t:I

    iget-wide v10, p0, Ls3/x2;->i:J

    iget-boolean v12, p0, Ls3/q;->v:Z

    move-object v0, v13

    move-object v9, p1

    invoke-direct/range {v0 .. v12}, Ls3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILs3/m1;ILu4/s;JZ)V

    return-object v13
.end method
