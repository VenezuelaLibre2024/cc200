.class public final Lm9/a0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lm9/a0;

.field public static final b:Lq8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/a0;

    invoke-direct {v0}, Lm9/a0;-><init>()V

    sput-object v0, Lm9/a0;->a:Lm9/a0;

    new-instance v0, Ls8/d;

    invoke-direct {v0}, Ls8/d;-><init>()V

    sget-object v1, Lm9/c;->a:Lr8/a;

    invoke-virtual {v0, v1}, Ls8/d;->j(Lr8/a;)Ls8/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls8/d;->k(Z)Ls8/d;

    move-result-object v0

    invoke-virtual {v0}, Ls8/d;->i()Lq8/a;

    move-result-object v0

    const-string v1, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lm9/a0;->b:Lq8/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ln7/g;Lm9/y;Lo9/f;Ljava/util/Map;Ljava/lang/String;)Lm9/z;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lm9/y;",
            "Lo9/f;",
            "Ljava/util/Map<",
            "Ln9/b$a;",
            "+",
            "Ln9/b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lm9/z;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const-string v2, "firebaseApp"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sessionDetails"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sessionsSettings"

    move-object/from16 v5, p3

    invoke-static {v5, v2}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "subscribers"

    invoke-static {v1, v2}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "firebaseInstallationId"

    move-object/from16 v11, p5

    invoke-static {v11, v2}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lm9/z;

    sget-object v12, Lm9/i;->j:Lm9/i;

    new-instance v13, Lm9/e0;

    invoke-virtual/range {p2 .. p2}, Lm9/y;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lm9/y;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lm9/y;->c()I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Lm9/y;->d()J

    move-result-wide v9

    new-instance v14, Lm9/e;

    sget-object v4, Ln9/b$a;->i:Ln9/b$a;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln9/b;

    invoke-virtual {v0, v4}, Lm9/a0;->d(Ln9/b;)Lm9/d;

    move-result-object v4

    sget-object v15, Ln9/b$a;->h:Ln9/b$a;

    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln9/b;

    invoke-virtual {v0, v1}, Lm9/a0;->d(Ln9/b;)Lm9/d;

    move-result-object v1

    move-object v15, v2

    invoke-virtual/range {p3 .. p3}, Lo9/f;->b()D

    move-result-wide v2

    invoke-direct {v14, v4, v1, v2, v3}, Lm9/e;-><init>(Lm9/d;Lm9/d;D)V

    move-object v4, v13

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-wide v8, v9

    move-object v10, v14

    invoke-direct/range {v4 .. v11}, Lm9/e0;-><init>(Ljava/lang/String;Ljava/lang/String;IJLm9/e;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lm9/a0;->b(Ln7/g;)Lm9/b;

    move-result-object v1

    move-object v2, v15

    invoke-direct {v2, v12, v13, v1}, Lm9/z;-><init>(Lm9/i;Lm9/e0;Lm9/b;)V

    return-object v2
.end method

.method public final b(Ln7/g;)Lm9/b;
    .locals 16

    const-string v0, "firebaseApp"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v0

    const-string v2, "firebaseApp.applicationContext"

    invoke-static {v0, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v3, v5, :cond_0

    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    iget v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object v6, v3

    new-instance v14, Lm9/b;

    invoke-virtual/range {p1 .. p1}, Ln7/g;->r()Ln7/p;

    move-result-object v3

    invoke-virtual {v3}, Ln7/p;->c()Ljava/lang/String;

    move-result-object v10

    const-string v3, "firebaseApp.options.applicationId"

    invoke-static {v10, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v3, "MODEL"

    invoke-static {v11, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v3, "RELEASE"

    invoke-static {v12, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lm9/s;->l:Lm9/s;

    new-instance v15, Lm9/a;

    const-string v3, "packageName"

    invoke-static {v4, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v5, v6

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "MANUFACTURER"

    invoke-static {v7, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm9/u;->a:Lm9/u;

    invoke-virtual/range {p1 .. p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lm9/u;->d(Landroid/content/Context;)Lm9/t;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lm9/u;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v9

    move-object v3, v15

    invoke-direct/range {v3 .. v9}, Lm9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm9/t;Ljava/util/List;)V

    const-string v0, "1.2.1"

    move-object v7, v14

    move-object v8, v10

    move-object v9, v11

    move-object v10, v0

    move-object v11, v12

    move-object v12, v13

    move-object v13, v15

    invoke-direct/range {v7 .. v13}, Lm9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm9/s;Lm9/a;)V

    return-object v14
.end method

.method public final c()Lq8/a;
    .locals 1

    sget-object v0, Lm9/a0;->b:Lq8/a;

    return-object v0
.end method

.method public final d(Ln9/b;)Lm9/d;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lm9/d;->j:Lm9/d;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ln9/b;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lm9/d;->k:Lm9/d;

    goto :goto_0

    :cond_1
    sget-object p1, Lm9/d;->l:Lm9/d;

    :goto_0
    return-object p1
.end method
