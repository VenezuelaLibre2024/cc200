.class public final synthetic Lh8/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh8/j$a;


# static fields
.field public static final synthetic a:Lh8/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/b;

    invoke-direct {v0}, Lh8/b;-><init>()V

    sput-object v0, Lh8/b;->a:Lh8/b;

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

    invoke-static {p1}, Lh8/j;->b(Landroid/util/JsonReader;)Lg8/f0$e$d$e;

    move-result-object p1

    return-object p1
.end method
