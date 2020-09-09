using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//using InsuranceDetails;
namespace InsuranceDetails             //DO NOT Change namespace name
{
    public class Insurance{
   private string insuranceNo,insuranceName;
       private double amountCovered;
       public string InsuranceNo{
           get{return insuranceNo;}set{insuranceNo=value;}}
        public string InsuranceName{get{return insuranceName;}set{insuranceName=value;}}
        public double AmountCovered{get{return amountCovered;}set{amountCovered=value;}}
        
    }
    public class MotorInsurance:Insurance{
        private double idv;
        private float depPercent;
        public double Idv{get{return idv;}set{idv=value;}}
        public float DepPercent{get{return depPercent;}set{depPercent=value;}}
        public double calculatePremium(){
            this.idv=this.AmountCovered-((this.AmountCovered*this.depPercent)/100);
            return this.idv*.03;
        }
    }
    public class LifeInsurance : Insurance
    {
        private int policyTerm;
        private float benefitPercent;
       public int PolicyTerm{get{return policyTerm;}set{policyTerm=value;}}
        public float BenefitPercent{get{return benefitPercent;}set{benefitPercent=value;}}
        public double calculatePremium(){
            double k=(this.AmountCovered*this.benefitPercent)/100;
            k=this.AmountCovered-k;
            k=k/this.PolicyTerm;
            return k;
        }
    }
    }
    