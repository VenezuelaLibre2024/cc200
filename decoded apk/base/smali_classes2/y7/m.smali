.class public final synthetic Ly7/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# static fields
.field public static final synthetic a:Ly7/m;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ly7/m;

    invoke-direct {v0}, Ly7/m;-><init>()V

    sput-object v0, Ly7/m;->a:Ly7/m;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
