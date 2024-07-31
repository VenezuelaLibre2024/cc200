.class public final synthetic Lx4/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Lx4/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lx4/a;

    invoke-direct {v0}, Lx4/a;-><init>()V

    sput-object v0, Lx4/a;->h:Lx4/a;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ly4/b;

    check-cast p2, Ly4/b;

    invoke-static {p1, p2}, Lx4/b;->a(Ly4/b;Ly4/b;)I

    move-result p1

    return p1
.end method
