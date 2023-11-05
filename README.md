# گزارش آزمایش دوم درس مهندسی نرم افزار

## اعضای گروه

+ سید محمدمهدی حاتمی 98109561
+ پیمان حاجی محمد 98170776

## شرح آزمایش

### گام صفر : آماده سازی مقدمات

در ابتدای این آزمایش محیط گیت پروژه را آماده می کنیم. فایل‌های نسخه‌ی اولیه ی پروژه را از مخزن درس برداشته در اولین کامیت قرار می دهیم. سپس مخزن گیت هاب پروژه را ساخته و مانند آزمایش قبل برنچ main آن را محافظت می کنیم.

سپس فایل‌های پروژه را مطالعه کرده و با نحوه‌ی پیاده سازی آن آشنا می شویم.

### گام یک : افزودن یک روش دیگر پرداخت

برای این قسمت ابتدا یک پیاده سازی جدید از واسط ServiceOrder پیاده سازی می کنیم که سفارش تلفنی را امکان پذیر سازد. سپس توابع این واسط را در این کلاس جدید پیاده سازی می کنیم که در تمام آن ها بدنه ی خالی قرار می دهیم. حال مطابق با دستور گفته شده دو تابع جدید به واسط اضافه کرده و آن ها را به تمام پیاده سازی های آن اضافه می کنیم.
<br/>
در نهایت به اجرای اصلی برنامه پرداخت تلفنی را مانند دیگر پرداخت ها اضافه می کنیم.
<br/>
در ادامه لیست تغییرات اعمال شده بر کد تا اینجا را مشاهده می کنید.
<table dir='rtl'>
<tbody>
    <tr>
        <td width="64">
        <p><strong>ردیف</strong></p>
        </td>
        <td width="198">
        <p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
        </td>
        <td width="141">
        <p><strong>عنوان تغییر</strong></p>
        </td>
        <td width="292">
        <p><strong>شرحی کوتاه از تغییر</strong></p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>ساخت کلاس سرویس سفارش تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک کلاس با ارث‌بری از واسط Order Service با عنوان phone Order Service</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۲</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع پرداخت آنلاین</p>
        </td>
        <td width="292">
        <p>پیاده سازی یک تابع online Order Payment از واسط با بدنه‌ی خالی</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۳</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>ساخت کلاس سرویس سفارش تلفنی</p>
        </td>
        <td width="292">
        <p>پیاده سازی یک تابع online Order Register از واسط با بدنه‌ی خالی</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۴</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع پرداخت حضوری</p>
        </td>
        <td width="292">
        <p>پیاده سازی یک تابع on-Site Order Payment از واسط با بدنه‌ی خالی</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۵</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع ثبت سفارش حضوری</p>
        </td>
        <td width="292">
        <p>پیاده سازی یک تابع on-Site Order Register از واسط با بدنه‌ی خالی</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۶</strong></p>
        </td>
        <td width="198">
        <p>Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع پرداخت تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Payment</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۷</strong></p>
        </td>
        <td width="198">
        <p>Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع ثبت سفارش تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Register</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۸</strong></p>
        </td>
        <td width="198">
        <p>Online Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع پرداخت تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Register که درون آن خالی است.</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۹</strong></p>
        </td>
        <td width="198">
        <p>OnSite Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع ثبت سفارش تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Register که درون آن خالی است.</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۰</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع ثبت سفارش تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Register که درون آن خالی است.</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۱</strong></p>
        </td>
        <td width="198">
        <p>Online Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع پرداخت تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Payment که درون آن خالی است.</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۲</strong></p>
        </td>
        <td width="198">
        <p>OnSite Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع پرداخت تلفنی</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Payment که درون آن خالی است.</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۳</strong></p>
        </td>
        <td width="198">
        <p>Phone Order Service</p>
        </td>
        <td width="141">
        <p>افزودن تابع  پرداخت</p>
        </td>
        <td width="292">
        <p>افزودن یک تابع void با عنوان phone Order Payment که درون آن خالی است.</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۴</strong></p>
        </td>
        <td width="198">
        <p>Main</p>
        </td>
        <td width="141">
        <p>تغییر پیام راهنمای اولیه</p>
        </td>
        <td width="292">
        <p>اضافه کردن گزینه ی پرداخت تلفنی به پیام ورود اولیه</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۵</strong></p>
        </td>
        <td width="198">
        <p>Main</p>
        </td>
        <td width="141">
        <p>افزودن ثبت سفارش تلفنی</p>
        </td>
        <td width="292">
        <p>اضافه کردن ثبت سفارش تلفنی به کد</p>
        </td>
    </tr>
    <tr>
        <td width="64">
        <p><strong>۱۶</strong></p>
        </td>
        <td width="198">
        <p>Main</p>
        </td>
        <td width="141">
        <p>افزودن پرداخت تلفنی</p>
        </td>
        <td width="292">
        <p>اضافه کردن پرداخت تلفنی به کد</p>
        </td>
    </tr>
</tbody>
</table>

مجموع تعداد تغییرات: ۱۶

### گام دو : تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

در این گام برقراری اصول SOLOD را در برنامه ی نوشته شده بررسی می کنیم. بررسی تک به تک موارد را در جدول زیر مشاهده می کنید. 

<table dir='rtl'>
<tbody>
    <tr>
    <td rowspan="2" width="240">
    <p>اصل 1</p>
    <p>Single Responsibility</p>
    </td>
    <td width="95">
    <p><strong>موارد تحقق</strong></p>
    </td>
    <td width="454">
    <p>در ساختار طراحی شده ی خود کلاس ها ارائه دهنده ی خدمت انواع مختلف پرداخت جدا شده اند که از این نظر این اصل تحقق یافته است. همچنین درباره ی کلاس های Food و Order به نظر می رسد این اصل به مقدار خوبی رعایت شده و تنها تغییر آن ها توسط تامین کننده ی غذا و سیستم مدیریت سفارشات انجام میشود. </p>
    </td>
    </tr>
    <tr>
    <td>
    <p><strong>موارد نقض</strong></p>
    </td>
    <td>
    <p>در کلاس های Order Service هر دوی عملکرد های ثبت سفارش و پرداخت در کنار هم ظاهر شده اند. در نتیجه هر دوی تیم پرداخت و ثبت سفارش با این کلاس درگیر هستند و اگر یکی از آن ها تغییری ایجاد کند، عملکرد تیم دیگر تحت تاثیر قرار میگیرد. 
    <br/>
    همچنین در واسط OrderService بسیار بیشتر از یک کار پیاده سازی شده که نقض آشکار این اصل به شمار می رود. 
</p>
    </td>
    </tr>
    <tr>
    <td rowspan="2">
    <p>اصل 2</p>
    <p>Open-Close Principle (OCP)</p>
    </td>
    <td>
    <p><strong>موارد تحقق</strong></p>
    </td>
    <td>
    <p>به نظر می رسد این اصل در کلاس های Food و Order رعایت شده است و مورد نقضی از آن مشاهده نمی شود. </p>
    </td>
    </tr>
    <tr>
    <td>
    <p><strong>موارد نقض</strong></p>
    </td>
    <td>
    <p>در این روش پیاده سازی این اصل خیلی زیاد نقض شده به گونه ای که اضافه کردن هر سرویس دهنده ی جدید باعث تغییر در تمام دیگر سرویس دهندگان می شود. حتی با این روش پیاده سازی اضافه کردن یک ویژگی به یک ارائه دهنده ی سرویس نیز منجر به تغییر در تمام آن ها می شود. </p>
    </td>
    </tr>
    <tr>
    <td rowspan="2">
    <p>اصل 3</p>
    <p>Liskov Substitution Principle</p>
    </td>
    <td>
    <p><strong>موارد تحقق</strong></p>
    </td>
    <td>
    <p>&nbsp;</p>
    </td>
    </tr>
    <tr>
    <td>
    <p><strong>موارد نقض</strong></p>
    </td>
    <td>
    <p>کلاس های پیاده سازی شده از Order Service همگی این اصل را نقض کرده اند چرا که از بین تمام ویژگی های واسط پدر، فقط دو تا از آن ها را ارائه می کنند و باقی توابع برای آن ها بی معنی است. در نتیجه این ارث بری از نظر مفهومی صحیح نمی باشد. </p>
    </td>
    </tr>
    <tr>
    <td rowspan="2">
    <p>اصل 4</p>
    <p>Interface Segregation Principle</p>
    </td>
    <td>
    <p><strong>موارد تحقق</strong></p>
    </td>
    <td>
    <p>&nbsp;</p>
    </td>
    </tr>
    <tr>
    <td>
    <p><strong>موارد نقض</strong></p>
    </td>
    <td>
    <p>به نظر می رسد در این پروژه ما یک واسط داریم که اشتباه تعریف شده است و به همین دلیل چندین کار را با هم انجام میدهد. البته به نظر می رسد در حالت ایده آل نیز یک واسط برای این پروژه کافی است. </p>
    </td>
    </tr>
    <tr>
    <td rowspan="2">
    <p>اصل 5</p>
    <p>Dependency Inversion Principle</p>
    </td>
    <td>
    <p><strong>موارد تحقق</strong></p>
    </td>
    <td>
    <p>این اصل در تعریف کلاس ها برنامه ی main ما را در ابتدا از نوع سرویس دهنده مستقل کرده است ولی جلوتر آن را نقض می کند. </p>
    </td>
    </tr>
    <tr>
    <td>
    <p><strong>موارد نقض</strong></p>
    </td>
    <td>
    <p>کلاس Order به کلاس Food وابستگی دارد. 
    <br/>
    برنامه ی اصلی ما به پیاده سازی های سرویس دهنده ها به خاطر تعامل با نوع آن ها مقداری وابستگی دارد.
    </p>
    </td>
    </tr>
</tbody>
</table>

در ادامه راهکارهایی برای موارد نقض شده از اصول SOLID ارائه می کنیم. 

<table dir='rtl'>
<tbody>
    <tr>
    <td width="168">
    <p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
    </td>
    <td width="246">
    <p><strong>علت نقض</strong></p>
    </td>
    <td width="284">
    <p><strong>راه حل پیشنهادی</strong></p>
    </td>
    </tr>
    <tr>
    <td width="168">
    <p>SRP</p>
    </td>
    <td width="246">
    <p>کلاس های سرویس دهنده دو کار را انجام میدهند و واسط آن ها تمام کارهای آن ها را انجام میدهد. </p>
    </td>
    <td width="284">
    <p>برای دو خدمت اصلی ارائه شده دو کلاس مجزا داشته باشیم و برای هر کدام از آن ها یک واسط تک منظوره طراحی کنیم. </p>
    </td>
    </tr>
    <tr>
    <td width="168">
    <p>OCP</p>
    </td>
    <td width="246">
    <p>واسط مورد نظر به درستی طراحی نشده است. </p>
    </td>
    <td width="284">
    <p>واسط را به گونه ای بازطراحی کنیم که فقط توابع اصلی را مشخص کرده باشد. </p>
    </td>
    </tr>
    <tr>
    <td width="168">
    <p>Liskov Substitution Principle</p>
    </td>
    <td width="246">
    <p>پیاده سازی های توابع واسط به عنوان تعریف تابع جدید در آن در نظر گرفته شده اند. </p>
    </td>
    <td width="284">
    <p>بازطراحی واسط به گونه که فقط توابع اصلی را مشخص کرده باشد. </p>
    </td>
    </tr>
<tr>
    <td width="168">
    <p>Interface Segregation Principle</p>
    </td>
    <td width="246">
    <p>واسط ما مسئولیت هایی بیشتر از مقدار مورد نیاز در خود تعریف کرده است. </p>
    </td>
    <td width="284">
    <p>بازطراحی واسط به گونه که فقط توابع اصلی را مشخص کرده باشد.</p>
    </td>
</tr>
    <tr>
    <td width="168">
    <p>Dependency Inversion Principle</p>
    </td>
    <td width="246">
    <p>کلاس سفارش مستقیم به کلاس غذا وابسته است و برنامه ی اصلی ما نیز به نوع کلاس های سرویس دهنده ها وابسته است.  </p>
    </td>
    <td width="284">
    <p>یک واسط OrderItem تعریف کنیم که کلاس غذا از آن ارث بری کند. مورد دیگر با بازتعریف واسط OrderService اصلاح می شود. </p>
    </td>
</tr>
</tbody>
</table>
