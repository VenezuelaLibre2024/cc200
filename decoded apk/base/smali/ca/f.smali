.class public Lca/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lca/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca/f$e;,
        Lca/f$i;,
        Lca/f$c;,
        Lca/f$g;,
        Lca/f$d;,
        Lca/f$f;,
        Lca/f$h;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Laa/b;",
        ">",
        "Ljava/lang/Object;",
        "Lca/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

.field private static final BUCKETS:[I


# instance fields
.field private mAnimate:Z

.field private mAnimationDurationMs:J

.field private mClickListener:Laa/c$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final mClusterManager:Laa/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mClusterMarkerCache:Lca/f$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/f$e<",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private mClusters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

.field private final mDensity:F

.field private final mExecutor:Ljava/util/concurrent/Executor;

.field private final mIconGenerator:Lha/b;

.field private mIcons:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lz6/b;",
            ">;"
        }
    .end annotation
.end field

.field private mInfoWindowClickListener:Laa/c$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mInfoWindowLongClickListener:Laa/c$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$e<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemClickListener:Laa/c$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$f<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemInfoWindowClickListener:Laa/c$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemInfoWindowLongClickListener:Laa/c$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$h<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final mMap:Lx6/c;

.field private mMarkerCache:Lca/f$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/f$e<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mMarkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lca/f$g;",
            ">;"
        }
    .end annotation
.end field

.field private mMinClusterSize:I

.field private final mViewModifier:Lca/f$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/f<",
            "TT;>.i;"
        }
    .end annotation
.end field

.field private mZoom:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lca/f;->BUCKETS:[I

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lca/f;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

    return-void

    :array_0
    .array-data 4
        0xa
        0x14
        0x32
        0x64
        0xc8
        0x1f4
        0x3e8
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lx6/c;Laa/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx6/c;",
            "Laa/c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lca/f;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lca/f;->mMarkers:Ljava/util/Set;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lca/f;->mIcons:Landroid/util/SparseArray;

    new-instance v0, Lca/f$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lca/f$e;-><init>(Lca/f$a;)V

    iput-object v0, p0, Lca/f;->mMarkerCache:Lca/f$e;

    const/4 v0, 0x4

    iput v0, p0, Lca/f;->mMinClusterSize:I

    new-instance v0, Lca/f$e;

    invoke-direct {v0, v1}, Lca/f$e;-><init>(Lca/f$a;)V

    iput-object v0, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    new-instance v0, Lca/f$i;

    invoke-direct {v0, p0, v1}, Lca/f$i;-><init>(Lca/f;Lca/f$a;)V

    iput-object v0, p0, Lca/f;->mViewModifier:Lca/f$i;

    iput-object p2, p0, Lca/f;->mMap:Lx6/c;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lca/f;->mAnimate:Z

    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lca/f;->mAnimationDurationMs:J

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Lca/f;->mDensity:F

    new-instance p2, Lha/b;

    invoke-direct {p2, p1}, Lha/b;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lca/f;->mIconGenerator:Lha/b;

    invoke-direct {p0, p1}, Lca/f;->makeSquareTextView(Landroid/content/Context;)Lha/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lha/b;->g(Landroid/view/View;)V

    sget p1, Lz9/d;->c:I

    invoke-virtual {p2, p1}, Lha/b;->i(I)V

    invoke-direct {p0}, Lca/f;->makeClusterBackground()Landroid/graphics/drawable/LayerDrawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Lha/b;->e(Landroid/graphics/drawable/Drawable;)V

    iput-object p3, p0, Lca/f;->mClusterManager:Laa/c;

    return-void
.end method

.method public static synthetic a(Lca/f;Lz6/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lca/f;->lambda$onAdd$0(Lz6/m;)V

    return-void
.end method

.method public static synthetic access$1000(Lca/f;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0, p1}, Lca/f;->immutableOf(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$1200(Lca/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lca/f;->mMarkers:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic access$1202(Lca/f;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    iput-object p1, p0, Lca/f;->mMarkers:Ljava/util/Set;

    return-object p1
.end method

.method public static synthetic access$1300(Lca/f;)Z
    .locals 0

    iget-boolean p0, p0, Lca/f;->mAnimate:Z

    return p0
.end method

.method public static synthetic access$1400(Lca/f;Ljava/util/List;Lea/b;)Lea/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lca/f;->findClosestCluster(Ljava/util/List;Lea/b;)Lea/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$1800(Lca/f;)Laa/c;
    .locals 0

    iget-object p0, p0, Lca/f;->mClusterManager:Laa/c;

    return-object p0
.end method

.method public static synthetic access$200(Lca/f;)Laa/c$f;
    .locals 0

    iget-object p0, p0, Lca/f;->mItemClickListener:Laa/c$f;

    return-object p0
.end method

.method public static synthetic access$2000(Lca/f;)Lca/f$e;
    .locals 0

    iget-object p0, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    return-object p0
.end method

.method public static synthetic access$2200()Landroid/animation/TimeInterpolator;
    .locals 1

    sget-object v0, Lca/f;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method public static synthetic access$2300(Lca/f;)J
    .locals 2

    iget-wide v0, p0, Lca/f;->mAnimationDurationMs:J

    return-wide v0
.end method

.method public static synthetic access$300(Lca/f;)Lca/f$e;
    .locals 0

    iget-object p0, p0, Lca/f;->mMarkerCache:Lca/f$e;

    return-object p0
.end method

.method public static synthetic access$400(Lca/f;)Laa/c$g;
    .locals 0

    iget-object p0, p0, Lca/f;->mItemInfoWindowClickListener:Laa/c$g;

    return-object p0
.end method

.method public static synthetic access$500(Lca/f;)Lx6/c;
    .locals 0

    iget-object p0, p0, Lca/f;->mMap:Lx6/c;

    return-object p0
.end method

.method public static synthetic access$600(Lca/f;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lca/f;->mExecutor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static synthetic access$800(Lca/f;)F
    .locals 0

    iget p0, p0, Lca/f;->mZoom:F

    return p0
.end method

.method public static synthetic access$802(Lca/f;F)F
    .locals 0

    iput p1, p0, Lca/f;->mZoom:F

    return p1
.end method

.method public static synthetic access$900(Lca/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lca/f;->mClusters:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic access$902(Lca/f;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    iput-object p1, p0, Lca/f;->mClusters:Ljava/util/Set;

    return-object p1
.end method

.method public static synthetic b(Lca/f;Lz6/m;)Z
    .locals 0

    invoke-direct {p0, p1}, Lca/f;->lambda$onAdd$1(Lz6/m;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lca/f;Lz6/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lca/f;->lambda$onAdd$3(Lz6/m;)V

    return-void
.end method

.method public static synthetic d(Lca/f;Lz6/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lca/f;->lambda$onAdd$2(Lz6/m;)V

    return-void
.end method

.method private static distanceSquared(Lea/b;Lea/b;)D
    .locals 6

    iget-wide v0, p0, Lea/b;->a:D

    iget-wide v2, p1, Lea/b;->a:D

    sub-double v4, v0, v2

    sub-double/2addr v0, v2

    mul-double/2addr v4, v0

    iget-wide v0, p0, Lea/b;->b:D

    iget-wide p0, p1, Lea/b;->b:D

    sub-double v2, v0, p0

    sub-double/2addr v0, p0

    mul-double/2addr v2, v0

    add-double/2addr v4, v2

    return-wide v4
.end method

.method private findClosestCluster(Ljava/util/List;Lea/b;)Lea/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lea/b;",
            ">;",
            "Lea/b;",
            ")",
            "Lea/b;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v1}, Laa/c;->e()Lba/b;

    move-result-object v1

    invoke-interface {v1}, Lba/b;->g()I

    move-result v1

    mul-int/2addr v1, v1

    int-to-double v1, v1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lea/b;

    invoke-static {v3, p2}, Lca/f;->distanceSquared(Lea/b;Lea/b;)D

    move-result-wide v4

    cmpg-double v6, v4, v1

    if-gez v6, :cond_1

    move-object v0, v3

    move-wide v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method private immutableOf(Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;)",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private synthetic lambda$onAdd$0(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lca/f;->mItemInfoWindowLongClickListener:Laa/c$h;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lca/f;->mMarkerCache:Lca/f$e;

    invoke-virtual {v1, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/b;

    invoke-interface {v0, p1}, Laa/c$h;->a(Laa/b;)V

    :cond_0
    return-void
.end method

.method private synthetic lambda$onAdd$1(Lz6/m;)Z
    .locals 2

    iget-object v0, p0, Lca/f;->mClickListener:Laa/c$c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    invoke-virtual {v1, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/a;

    invoke-interface {v0, p1}, Laa/c$c;->onClusterClick(Laa/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private synthetic lambda$onAdd$2(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lca/f;->mInfoWindowClickListener:Laa/c$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    invoke-virtual {v1, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/a;

    invoke-interface {v0, p1}, Laa/c$d;->a(Laa/a;)V

    :cond_0
    return-void
.end method

.method private synthetic lambda$onAdd$3(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lca/f;->mInfoWindowLongClickListener:Laa/c$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    invoke-virtual {v1, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/a;

    invoke-interface {v0, p1}, Laa/c$e;->a(Laa/a;)V

    :cond_0
    return-void
.end method

.method private makeClusterBackground()Landroid/graphics/drawable/LayerDrawable;
    .locals 9

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    iput-object v0, p0, Lca/f;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    const v2, -0x7f000001

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    iget-object v0, p0, Lca/f;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-direct {v1, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iget v0, p0, Lca/f;->mDensity:F

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v0, v2

    float-to-int v8, v0

    const/4 v4, 0x1

    move-object v3, v1

    move v5, v8

    move v6, v8

    move v7, v8

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    return-object v1
.end method

.method private makeSquareTextView(Landroid/content/Context;)Lha/c;
    .locals 2

    new-instance v0, Lha/c;

    invoke-direct {v0, p1}, Lha/c;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget p1, Lz9/b;->a:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setId(I)V

    iget p1, p0, Lca/f;->mDensity:F

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr p1, v1

    float-to-int p1, p1

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    return-object v0
.end method


# virtual methods
.method public getBucket(Laa/a;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;)I"
        }
    .end annotation

    invoke-interface {p1}, Laa/a;->c()I

    move-result p1

    sget-object v0, Lca/f;->BUCKETS:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-gt p1, v0, :cond_0

    return p1

    :cond_0
    :goto_0
    sget-object v0, Lca/f;->BUCKETS:[I

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    add-int/lit8 v2, v1, 0x1

    aget v3, v0, v2

    if-ge p1, v3, :cond_1

    aget p1, v0, v1

    return p1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aget p1, v0, p1

    return p1
.end method

.method public getCluster(Lz6/m;)Laa/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz6/m;",
            ")",
            "Laa/a<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    invoke-virtual {v0, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/a;

    return-object p1
.end method

.method public getClusterItem(Lz6/m;)Laa/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz6/m;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lca/f;->mMarkerCache:Lca/f$e;

    invoke-virtual {v0, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/b;

    return-object p1
.end method

.method public getClusterText(I)Ljava/lang/String;
    .locals 2

    sget-object v0, Lca/f;->BUCKETS:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-ge p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "+"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getClusterTextAppearance(I)I
    .locals 0

    sget p1, Lz9/d;->c:I

    return p1
.end method

.method public getColor(I)I
    .locals 2

    int-to-float p1, p1

    const/high16 v0, 0x43960000    # 300.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    sub-float/2addr v0, p1

    mul-float/2addr v0, v0

    const p1, 0x47afc800    # 90000.0f

    div-float/2addr v0, p1

    const/high16 p1, 0x435c0000    # 220.0f

    mul-float/2addr v0, p1

    const/4 p1, 0x3

    new-array p1, p1, [F

    const/4 v1, 0x0

    aput v0, p1, v1

    const/4 v0, 0x1

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p1, v0

    const/4 v0, 0x2

    const v1, 0x3f19999a    # 0.6f

    aput v1, p1, v0

    invoke-static {p1}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result p1

    return p1
.end method

.method public getDescriptorForCluster(Laa/a;)Lz6/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;)",
            "Lz6/b;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lca/f;->getBucket(Laa/a;)I

    move-result p1

    iget-object v0, p0, Lca/f;->mIcons:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lca/f;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {p0, p1}, Lca/f;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lca/f;->mIconGenerator:Lha/b;

    invoke-virtual {p0, p1}, Lca/f;->getClusterTextAppearance(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lha/b;->i(I)V

    iget-object v0, p0, Lca/f;->mIconGenerator:Lha/b;

    invoke-virtual {p0, p1}, Lca/f;->getClusterText(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lha/b;->d(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lz6/c;->d(Landroid/graphics/Bitmap;)Lz6/b;

    move-result-object v0

    iget-object v1, p0, Lca/f;->mIcons:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public getMarker(Laa/a;)Lz6/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;)",
            "Lz6/m;"
        }
    .end annotation

    iget-object v0, p0, Lca/f;->mClusterMarkerCache:Lca/f$e;

    invoke-virtual {v0, p1}, Lca/f$e;->b(Ljava/lang/Object;)Lz6/m;

    move-result-object p1

    return-object p1
.end method

.method public getMarker(Laa/b;)Lz6/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lz6/m;"
        }
    .end annotation

    iget-object v0, p0, Lca/f;->mMarkerCache:Lca/f$e;

    invoke-virtual {v0, p1}, Lca/f$e;->b(Ljava/lang/Object;)Lz6/m;

    move-result-object p1

    return-object p1
.end method

.method public getMinClusterSize()I
    .locals 1

    iget v0, p0, Lca/f;->mMinClusterSize:I

    return v0
.end method

.method public onAdd()V
    .locals 2

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()Lda/b$a;

    move-result-object v0

    new-instance v1, Lca/f$a;

    invoke-direct {v1, p0}, Lca/f$a;-><init>(Lca/f;)V

    invoke-virtual {v0, v1}, Lda/b$a;->m(Lx6/c$j;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()Lda/b$a;

    move-result-object v0

    new-instance v1, Lca/f$b;

    invoke-direct {v1, p0}, Lca/f$b;-><init>(Lca/f;)V

    invoke-virtual {v0, v1}, Lda/b$a;->k(Lx6/c$f;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()Lda/b$a;

    move-result-object v0

    new-instance v1, Lca/c;

    invoke-direct {v1, p0}, Lca/c;-><init>(Lca/f;)V

    invoke-virtual {v0, v1}, Lda/b$a;->l(Lx6/c$g;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->f()Lda/b$a;

    move-result-object v0

    new-instance v1, Lca/e;

    invoke-direct {v1, p0}, Lca/e;-><init>(Lca/f;)V

    invoke-virtual {v0, v1}, Lda/b$a;->m(Lx6/c$j;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->f()Lda/b$a;

    move-result-object v0

    new-instance v1, Lca/b;

    invoke-direct {v1, p0}, Lca/b;-><init>(Lca/f;)V

    invoke-virtual {v0, v1}, Lda/b$a;->k(Lx6/c$f;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->f()Lda/b$a;

    move-result-object v0

    new-instance v1, Lca/d;

    invoke-direct {v1, p0}, Lca/d;-><init>(Lca/f;)V

    invoke-virtual {v0, v1}, Lda/b$a;->l(Lx6/c$g;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Laa/b;Lz6/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz6/n;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz6/n;->f0(Ljava/lang/String;)Lz6/n;

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz6/n;->e0(Ljava/lang/String;)Lz6/n;

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Lz6/n;->f0(Ljava/lang/String;)Lz6/n;

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public onBeforeClusterRendered(Laa/a;Lz6/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;",
            "Lz6/n;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lca/f;->getDescriptorForCluster(Laa/a;)Lz6/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz6/n;->X(Lz6/b;)Lz6/n;

    return-void
.end method

.method public onClusterItemRendered(Laa/b;Lz6/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz6/m;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onClusterItemUpdated(Laa/b;Lz6/m;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz6/m;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lz6/m;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz6/m;->q(Ljava/lang/String;)V

    move v2, v1

    :cond_0
    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lz6/m;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz6/m;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lz6/m;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Laa/b;->getSnippet()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lz6/m;->q(Ljava/lang/String;)V

    :goto_1
    move v2, v1

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lz6/m;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Laa/b;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {p2}, Lz6/m;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {p1}, Laa/b;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1}, Laa/b;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz6/m;->n(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-interface {p1}, Laa/b;->getZIndex()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Laa/b;->getZIndex()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p2, p1}, Lz6/m;->s(F)V

    goto :goto_3

    :cond_4
    move v1, v2

    :cond_5
    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual {p2}, Lz6/m;->f()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p2}, Lz6/m;->t()V

    :cond_6
    return-void
.end method

.method public onClusterRendered(Laa/a;Lz6/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;",
            "Lz6/m;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onClusterUpdated(Laa/a;Lz6/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;",
            "Lz6/m;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lca/f;->getDescriptorForCluster(Laa/a;)Lz6/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz6/m;->l(Lz6/b;)V

    return-void
.end method

.method public onClustersChanged(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lca/f;->mViewModifier:Lca/f$i;

    invoke-virtual {v0, p1}, Lca/f$i;->c(Ljava/util/Set;)V

    return-void
.end method

.method public onRemove()V
    .locals 2

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()Lda/b$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lda/b$a;->m(Lx6/c$j;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()Lda/b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lda/b$a;->k(Lx6/c$f;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()Lda/b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lda/b$a;->l(Lx6/c$g;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->f()Lda/b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lda/b$a;->m(Lx6/c$j;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->f()Lda/b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lda/b$a;->k(Lx6/c$f;)V

    iget-object v0, p0, Lca/f;->mClusterManager:Laa/c;

    invoke-virtual {v0}, Laa/c;->f()Lda/b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lda/b$a;->l(Lx6/c$g;)V

    return-void
.end method

.method public setAnimation(Z)V
    .locals 0

    iput-boolean p1, p0, Lca/f;->mAnimate:Z

    return-void
.end method

.method public setAnimationDuration(J)V
    .locals 0

    iput-wide p1, p0, Lca/f;->mAnimationDurationMs:J

    return-void
.end method

.method public setMinClusterSize(I)V
    .locals 0

    iput p1, p0, Lca/f;->mMinClusterSize:I

    return-void
.end method

.method public setOnClusterClickListener(Laa/c$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$c<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f;->mClickListener:Laa/c$c;

    return-void
.end method

.method public setOnClusterInfoWindowClickListener(Laa/c$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$d<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f;->mInfoWindowClickListener:Laa/c$d;

    return-void
.end method

.method public setOnClusterInfoWindowLongClickListener(Laa/c$e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$e<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f;->mInfoWindowLongClickListener:Laa/c$e;

    return-void
.end method

.method public setOnClusterItemClickListener(Laa/c$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$f<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f;->mItemClickListener:Laa/c$f;

    return-void
.end method

.method public setOnClusterItemInfoWindowClickListener(Laa/c$g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$g<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f;->mItemInfoWindowClickListener:Laa/c$g;

    return-void
.end method

.method public setOnClusterItemInfoWindowLongClickListener(Laa/c$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$h<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f;->mItemInfoWindowLongClickListener:Laa/c$h;

    return-void
.end method

.method public shouldRender(Ljava/util/Set;Ljava/util/Set;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;)Z"
        }
    .end annotation

    invoke-interface {p2, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public shouldRenderAsCluster(Laa/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Laa/a;->c()I

    move-result p1

    iget v0, p0, Lca/f;->mMinClusterSize:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
