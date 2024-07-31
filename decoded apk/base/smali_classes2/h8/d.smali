.class public final synthetic Lh8/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh8/j$a;


# static fields
.field public static final synthetic a:Lh8/d;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/d;

    invoke-direct {v0}, Lh8/d;-><init>()V

    sput-object v0, Lh8/d;->a:Lh8/d;

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

    invoke-static {p1}, Lh8/j;->d(Landroid/util/JsonReader;)Lg8/f0$e$d$a$b$e$b;

    move-result-object p1

    return-object p1
.end method
