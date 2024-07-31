.class public final Ld5/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:Landroid/graphics/Bitmap;

.field public c:Landroid/text/Layout$Alignment;

.field public d:Landroid/text/Layout$Alignment;

.field public e:F

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:I

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:I

.field public p:I

.field public q:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld5/b$b;->a:Ljava/lang/CharSequence;

    iput-object v0, p0, Ld5/b$b;->b:Landroid/graphics/Bitmap;

    iput-object v0, p0, Ld5/b$b;->c:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Ld5/b$b;->d:Landroid/text/Layout$Alignment;

    const v0, -0x800001

    iput v0, p0, Ld5/b$b;->e:F

    const/high16 v1, -0x80000000

    iput v1, p0, Ld5/b$b;->f:I

    iput v1, p0, Ld5/b$b;->g:I

    iput v0, p0, Ld5/b$b;->h:F

    iput v1, p0, Ld5/b$b;->i:I

    iput v1, p0, Ld5/b$b;->j:I

    iput v0, p0, Ld5/b$b;->k:F

    iput v0, p0, Ld5/b$b;->l:F

    iput v0, p0, Ld5/b$b;->m:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld5/b$b;->n:Z

    const/high16 v0, -0x1000000

    iput v0, p0, Ld5/b$b;->o:I

    iput v1, p0, Ld5/b$b;->p:I

    return-void
.end method

.method public constructor <init>(Ld5/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ld5/b;->h:Ljava/lang/CharSequence;

    iput-object v0, p0, Ld5/b$b;->a:Ljava/lang/CharSequence;

    iget-object v0, p1, Ld5/b;->k:Landroid/graphics/Bitmap;

    iput-object v0, p0, Ld5/b$b;->b:Landroid/graphics/Bitmap;

    iget-object v0, p1, Ld5/b;->i:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Ld5/b$b;->c:Landroid/text/Layout$Alignment;

    iget-object v0, p1, Ld5/b;->j:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Ld5/b$b;->d:Landroid/text/Layout$Alignment;

    iget v0, p1, Ld5/b;->l:F

    iput v0, p0, Ld5/b$b;->e:F

    iget v0, p1, Ld5/b;->m:I

    iput v0, p0, Ld5/b$b;->f:I

    iget v0, p1, Ld5/b;->n:I

    iput v0, p0, Ld5/b$b;->g:I

    iget v0, p1, Ld5/b;->o:F

    iput v0, p0, Ld5/b$b;->h:F

    iget v0, p1, Ld5/b;->p:I

    iput v0, p0, Ld5/b$b;->i:I

    iget v0, p1, Ld5/b;->u:I

    iput v0, p0, Ld5/b$b;->j:I

    iget v0, p1, Ld5/b;->v:F

    iput v0, p0, Ld5/b$b;->k:F

    iget v0, p1, Ld5/b;->q:F

    iput v0, p0, Ld5/b$b;->l:F

    iget v0, p1, Ld5/b;->r:F

    iput v0, p0, Ld5/b$b;->m:F

    iget-boolean v0, p1, Ld5/b;->s:Z

    iput-boolean v0, p0, Ld5/b$b;->n:Z

    iget v0, p1, Ld5/b;->t:I

    iput v0, p0, Ld5/b$b;->o:I

    iget v0, p1, Ld5/b;->w:I

    iput v0, p0, Ld5/b$b;->p:I

    iget p1, p1, Ld5/b;->x:F

    iput p1, p0, Ld5/b$b;->q:F

    return-void
.end method

.method public synthetic constructor <init>(Ld5/b;Ld5/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld5/b$b;-><init>(Ld5/b;)V

    return-void
.end method


# virtual methods
.method public a()Ld5/b;
    .locals 22

    move-object/from16 v0, p0

    new-instance v20, Ld5/b;

    move-object/from16 v1, v20

    iget-object v2, v0, Ld5/b$b;->a:Ljava/lang/CharSequence;

    iget-object v3, v0, Ld5/b$b;->c:Landroid/text/Layout$Alignment;

    iget-object v4, v0, Ld5/b$b;->d:Landroid/text/Layout$Alignment;

    iget-object v5, v0, Ld5/b$b;->b:Landroid/graphics/Bitmap;

    iget v6, v0, Ld5/b$b;->e:F

    iget v7, v0, Ld5/b$b;->f:I

    iget v8, v0, Ld5/b$b;->g:I

    iget v9, v0, Ld5/b$b;->h:F

    iget v10, v0, Ld5/b$b;->i:I

    iget v11, v0, Ld5/b$b;->j:I

    iget v12, v0, Ld5/b$b;->k:F

    iget v13, v0, Ld5/b$b;->l:F

    iget v14, v0, Ld5/b$b;->m:F

    iget-boolean v15, v0, Ld5/b$b;->n:Z

    move-object/from16 v21, v1

    iget v1, v0, Ld5/b$b;->o:I

    move/from16 v16, v1

    iget v1, v0, Ld5/b$b;->p:I

    move/from16 v17, v1

    iget v1, v0, Ld5/b$b;->q:F

    move/from16 v18, v1

    const/16 v19, 0x0

    move-object/from16 v1, v21

    invoke-direct/range {v1 .. v19}, Ld5/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLd5/b$a;)V

    return-object v20
.end method

.method public b()Ld5/b$b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld5/b$b;->n:Z

    return-object p0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ld5/b$b;->g:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ld5/b$b;->i:I

    return v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ld5/b$b;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public f(Landroid/graphics/Bitmap;)Ld5/b$b;
    .locals 0

    iput-object p1, p0, Ld5/b$b;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public g(F)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->m:F

    return-object p0
.end method

.method public h(FI)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->e:F

    iput p2, p0, Ld5/b$b;->f:I

    return-object p0
.end method

.method public i(I)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->g:I

    return-object p0
.end method

.method public j(Landroid/text/Layout$Alignment;)Ld5/b$b;
    .locals 0

    iput-object p1, p0, Ld5/b$b;->d:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public k(F)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->h:F

    return-object p0
.end method

.method public l(I)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->i:I

    return-object p0
.end method

.method public m(F)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->q:F

    return-object p0
.end method

.method public n(F)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->l:F

    return-object p0
.end method

.method public o(Ljava/lang/CharSequence;)Ld5/b$b;
    .locals 0

    iput-object p1, p0, Ld5/b$b;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public p(Landroid/text/Layout$Alignment;)Ld5/b$b;
    .locals 0

    iput-object p1, p0, Ld5/b$b;->c:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public q(FI)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->k:F

    iput p2, p0, Ld5/b$b;->j:I

    return-object p0
.end method

.method public r(I)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->p:I

    return-object p0
.end method

.method public s(I)Ld5/b$b;
    .locals 0

    iput p1, p0, Ld5/b$b;->o:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld5/b$b;->n:Z

    return-object p0
.end method
