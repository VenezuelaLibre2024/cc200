.class public final synthetic Lh8/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh8/j$a;


# static fields
.field public static final synthetic a:Lh8/g;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/g;

    invoke-direct {v0}, Lh8/g;-><init>()V

    sput-object v0, Lh8/g;->a:Lh8/g;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lh8/j;->g(Landroid/util/JsonReader;)Lg8/f0$d$b;

    move-result-object p1

    return-object p1
.end method
