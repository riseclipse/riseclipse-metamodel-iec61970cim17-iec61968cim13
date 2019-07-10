/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEPFController;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEPFController} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PFVArType2IEEEPFControllerItemProvider extends PFVArControllerType2DynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PFVArType2IEEEPFControllerItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addExlonPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addPfrefPropertyDescriptor( object );
            addVclmtPropertyDescriptor( object );
            addVrefPropertyDescriptor( object );
            addVsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Exlon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExlonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_exlon_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_exlon_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Exlon(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_ki_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Ki(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_kp_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pfref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPfrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_pfref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_pfref_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Pfref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vclmt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVclmtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_vclmt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_vclmt_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Vclmt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_vref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_vref_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Vref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEPFController_vs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEPFController_vs_feature",
                                "_UI_PFVArType2IEEEPFController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEPFController_Vs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns PFVArType2IEEEPFController.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PFVArType2IEEEPFController" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PFVArType2IEEEPFController ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PFVArType2IEEEPFController_type" )
                : getString( "_UI_PFVArType2IEEEPFController_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( PFVArType2IEEEPFController.class ) ) {
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON:
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI:
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP:
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF:
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT:
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF:
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
